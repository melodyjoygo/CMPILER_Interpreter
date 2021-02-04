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

        method = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = method.getFunctionName();

        parameterValue = new ArrayList<>();

    }

    public FunctionCallCommand(CParser.MethodInvocation_lfno_primaryContext methodInvocationContext){
        isNormalCall = false;
        this.methodInvocation_lfno_primaryContext = methodInvocationContext;
        this.functionName = methodInvocationContext.methodName().identifier().getText();

        method = SymbolTableManager.getInstance().findFunction(functionName);
        this.functionName = method.getFunctionName();

        parameterValue = new ArrayList<>();

    }

    public Value evaluateFunctionCall(){
        this.execute();
        return this.method.getReturnValue();
    }

    @Override
    public void execute() {
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
        //comment
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        //comment
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        //comment
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
        //comment
    }
}
