package model.commands.simple;

import model.OutputManager;
import antlr.CParser;
import model.SymbolTableManager;
import model.commands.EvaluateCommand;
import model.commands.ICommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

public class PrintCommand implements ICommand, ParseTreeListener {

    private CParser.FunctionCallerContext functionCallerContext;
    private CParser.ExpressionContext expressionContext;

    String evaluatedExpression;

    public PrintCommand(CParser.FunctionCallerContext functionCallerContext){
        this.functionCallerContext = functionCallerContext;
    }


    @Override
    public void execute() {

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, this.functionCallerContext);
        EvaluateCommand evaluateCommand = new EvaluateCommand(expressionContext);
        evaluateCommand.execute();
        this.evaluatedExpression = (String) evaluateCommand.evaluateExpression();
        System.out.println("Executing Print Command in function: " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
        evaluatedExpression = evaluatedExpression.replace(".", "");
        evaluatedExpression = evaluatedExpression.replace("0", "");
        OutputManager.getInstance().addoutputLog(evaluatedExpression);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof CParser.ExpressionContext){
            this.expressionContext = (CParser.ExpressionContext) parserRuleContext;
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
