package commands.simple;

import Managers.symbols.SymbolTableManager;
import antlr.CParser;
import commands.EvaluateCommand;
import commands.ICommand;
import representations.CFunction;
import representations.Value;

public class ReturnCommand implements ICommand {
    private CParser.ExpressionContext expressionContext;
    private CFunction cFunction;

    public ReturnCommand(CParser.ExpressionContext expressionContext, CFunction cFunction) {
        this.expressionContext = expressionContext;
        this.cFunction = cFunction;
    }

    @Override
    public void execute() {
        SymbolTableManager.getInstance().setCurrentFunction(cFunction);
        SymbolTableManager.getInstance().setCurrentScope(cFunction.getFunctionScope());

        EvaluateCommand evaluationCommand = new EvaluateCommand(this.expressionContext);
        evaluationCommand.execute();
        Object value = evaluationCommand.evaluateExpression();
        Value functionReturn = cFunction.getReturnValue();
        functionReturn.setValue(value);
        System.out.println("Return " + (String) functionReturn.getValue());
    }
}
