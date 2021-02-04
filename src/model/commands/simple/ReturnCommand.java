package model.commands.simple;

import model.SymbolTableManager;
import antlr.CParser;
import model.commands.ICommand;
import model.commands.EvaluateCommand;
import model.representations.Method;
import model.representations.Value;

public class ReturnCommand implements ICommand {
    private CParser.ExpressionContext expressionContext;
    private Method method;

    public ReturnCommand(CParser.ExpressionContext expressionContext, Method method) {
        this.expressionContext = expressionContext;
        this.method = method;
    }

    @Override
    public void execute() {
        SymbolTableManager.getInstance().setCurrentFunction(method);
        SymbolTableManager.getInstance().setCurrentScope(method.getFunctionScope());

        EvaluateCommand evaluationCommand = new EvaluateCommand(this.expressionContext);
        evaluationCommand.execute();
        Object value = evaluationCommand.evaluateExpression();
        Value functionReturn = method.getReturnValue();
        functionReturn.setValue(value);
    }
}
