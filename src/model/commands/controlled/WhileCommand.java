package model.commands.controlled;

import antlr.CParser;
import model.commands.EvaluateCommand;
import model.commands.ICommand;

import java.util.ArrayList;

public class WhileCommand implements IControlledCommand{
    private ArrayList<ICommand> commandList;
    private CParser.ExpressionContext expressionContext;

    public WhileCommand(CParser.ExpressionContext expression) {
        expressionContext = expression;
        commandList = new ArrayList<>();
    }

    @Override
    public void execute() {
        EvaluateCommand evaluateCommand = new EvaluateCommand(expressionContext);
        evaluateCommand.execute();
        boolean shakesphere = false;
        if(Double.valueOf((String) evaluateCommand.evaluateExpression()) > 0.0){
            shakesphere = true;
        }
        if(shakesphere){
            for(ICommand command: commandList){
                command.execute();
            }
            this.execute();
        }
    }

    @Override
    public ControlTypeEnum getControlType() {
        return ControlTypeEnum.WHILE_CONTROL;
    }

    @Override
    public void addCommand(ICommand command) {
        commandList.add(command);
    }


}
