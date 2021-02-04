package model.commands.simple;

import model.SymbolTableManager;
import antlr.CParser;
import model.commands.EvaluateCommand;
import model.commands.ICommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import model.representations.Method;
import model.representations.PrimitiveType;
import model.representations.Value;

import java.util.ArrayList;

public class FunctionCallCommand implements ICommand, ParseTreeListener {


    private CParser.MethodInvocationContext methodInvocationContext;
    private CParser.MethodInvocation_lfno_primaryContext methodInvocation_lfno_primaryContext;
    private Method method;
    private Method parentFunction;
    private CParser.ExpressionContext expressionContext;
    private String functionName;
    private boolean isNormalCall;
    private ArrayList<Value> parameterValue;

    public FunctionCallCommand(CParser.MethodInvocationContext methodInvocationContext){
        isNormalCall = true;
        this.methodInvocationContext = methodInvocationContext;
        this.functionName = methodInvocationContext.methodName().identifier().getText();

        // get function template, the function template does not need to be cloned because all we want is the ICommand List,
        //                        The parameters are reset every function call
        method = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = method.getFunctionName();

        //walk the function call to get parameters
        parameterValue = new ArrayList<>();

    }

    public FunctionCallCommand(CParser.MethodInvocation_lfno_primaryContext methodInvocationContext){
        isNormalCall = false;
        this.methodInvocation_lfno_primaryContext = methodInvocationContext;
        this.functionName = methodInvocationContext.methodName().identifier().getText();

        // get function template, the function template does not need to be cloned because all we want is the ICommand List,
        //                        The parameters are reset every function call
        method = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = method.getFunctionName();
        System.out.println("Function call in variable assignment in " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());

        parameterValue = new ArrayList<>();

    }

    public Value evaluateFunctionCall(){
//        System.out.println("Executing function call in an expression in function " + parentFunction.getFunctionName());
        this.execute();
        return this.method.getReturnValue();
    }

    @Override
    public void execute() {
        System.out.println("Executing function call: " + functionName + "" );
        parentFunction = SymbolTableManager.getInstance().getCurrentFunction();
        // set the paremeters of the function
        //walk the function call to get parameters
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        if(isNormalCall){
            treeWalker.walk(this, this.methodInvocationContext);
        }
        else{
            treeWalker.walk(this, this.methodInvocation_lfno_primaryContext);
        }
        this.method.setParameters(parameterValue);
        SymbolTableManager.getInstance().setCurrentFunction(this.method);
        SymbolTableManager.getInstance().setCurrentScope(this.method.getFunctionScope());
        for (ICommand command: method.getCommandList()) {
            command.execute();
        }
        SymbolTableManager.getInstance().setCurrentFunction(parentFunction);
        SymbolTableManager.getInstance().setCurrentScope(parentFunction.getFunctionScope());
    }

    public void getReturn(){

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        // if the function call encounters an expression, the expression is counted as a parameter of the function
        if(parserRuleContext instanceof CParser.ExpressionContext){
//            Value parameterValue = new EvaluateCommand((CParser.ExpressionContext) parserRuleContext);
            EvaluateCommand evaluateCommand = new EvaluateCommand((CParser.ExpressionContext) parserRuleContext);
            evaluateCommand.execute();

            Value tempValue = new Value(evaluateCommand.evaluateExpression(), PrimitiveType.VOID);
            parameterValue.add(tempValue);
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
