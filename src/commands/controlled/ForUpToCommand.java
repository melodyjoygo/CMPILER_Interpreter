package commands.controlled;

import Managers.symbols.SymbolTableManager;
import antlr.CParser;
import commands.EvaluateCommand;
import commands.ICommand;
import representations.Value;

import java.util.ArrayList;

public class ForUpToCommand implements IControlledCommand{
    private ArrayList<ICommand> commandList;
    CParser.IdentifierContext identifierContext;
    private CParser.ExpressionContext expressionContext;


    public ForUpToCommand(CParser.IdentifierContext identifierContext, CParser.ExpressionContext expressionContext) {
        this.expressionContext = expressionContext;
        this.identifierContext = identifierContext;
        commandList = new ArrayList<>();
    }

    @Override
    public void execute() {
        Value value = SymbolTableManager.getInstance().getCurrentScope().findVariableValueAllScopes(identifierContext.getText());
        EvaluateCommand evaluateCommand = new EvaluateCommand(expressionContext);
        evaluateCommand.execute();
        if(Double.valueOf((String)value.getValue()) < Double.valueOf((String) evaluateCommand.evaluateExpression())){
            for(ICommand command : commandList){
                command.execute();
            }
            value.incrementValue();
            this.execute();
        }
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.FOR_UP_TO_CONTROL;
    }

    @Override
    public void addCommand(ICommand command) {
        commandList.add(command);
    }


}
