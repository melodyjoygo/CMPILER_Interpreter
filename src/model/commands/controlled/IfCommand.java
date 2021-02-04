package model.commands.controlled;

import antlr.CParser;
import model.commands.ICommand;
import model.CommandControlManager;
import model.commands.EvaluateCommand;

import java.util.*;

public class IfCommand implements IConditionalCommand, IControlledCommand {

    private ArrayList<ICommand> positiveCommands; //list of model.commands.commands to execute if the condition holds true
    private ArrayList<ICommand> negativeCommands; //list of model.commands.commands to execute if the condition holds false

    private CParser.ExpressionContext conditionalExpression;

    public IfCommand(CParser.ExpressionContext conditionalExpression) {
        this.conditionalExpression = conditionalExpression;
        this.positiveCommands = new ArrayList<>();
        this.negativeCommands = new ArrayList<>();
    }

    @Override
    public void execute() {
        //Check evalute conditional expression if true ba or hindi
        EvaluateCommand evaluateCommand = new EvaluateCommand(conditionalExpression);
        evaluateCommand.execute();
        Object evaluation = evaluateCommand.evaluateExpression();
        boolean bool = false;
        if(Double.valueOf((String) evaluation) > 0.0){
            bool = true;
        }

        if(bool){
            for (ICommand command: positiveCommands) {
                command.execute();
            }
        }
        else{
            for (ICommand command: negativeCommands) {
                command.execute();
            }
        }
    }

    @Override
    public IControlledCommand.ControlTypeEnum getControlType() {
        return IControlledCommand.ControlTypeEnum.CONDITIONAL_IF;
    }

    @Override
    public void addCommand(ICommand command){
        if(CommandControlManager.getInstance().getIsInPositive()){
            this.addPositiveCommand(command);
        }
        else{
            this.addNegativeCommand(command);
        }
    }

    @Override
    public void addPositiveCommand(ICommand command) {
        this.positiveCommands.add(command);
    }

    @Override
    public void addNegativeCommand(ICommand command) {
        this.negativeCommands.add(command);
    }
}
