package model;

import model.commands.ICommand;
import model.commands.controlled.IConditionalCommand;
import model.commands.controlled.IControlledCommand;

import java.util.Stack;

public class CommandControlManager {
    private static CommandControlManager sharedInstance = null;
    private static Stack<ICommand> commandList;
    private static ICommand currentCommand;
    private static boolean isInPositive = true;
    private static boolean isInControl = false;
    private static IControlledCommand.ControlTypeEnum controlType;
    private CommandControlManager(){

    }


    public static CommandControlManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new CommandControlManager();
            commandList = new Stack<>();
            isInPositive = true;
            isInControl = false;
            currentCommand = null;
            controlType = null;
        }

        return sharedInstance;
    }

    public static void resetConditionalManager(){ //Call this when leaving a controlled command
        sharedInstance = null;
    }


    public boolean isControl(){
        return this.isInControl;
    }


    public void initializeCommand(ICommand command, IControlledCommand.ControlTypeEnum controlType){
        if(!isInControl){
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(command);
        }
        else{
            this.addCommand(command);
        }

        commandList.add(command);
        currentCommand = command;
        isInControl = true;
        isInPositive = true;
        this.controlType = controlType;
    }


    public void addCommand(ICommand command){
        if(this.controlType == IControlledCommand.ControlTypeEnum.CONDITIONAL_IF){
            if(isInPositive){
                ((IConditionalCommand)currentCommand).addPositiveCommand(command);
            }
            else{
                ((IConditionalCommand)currentCommand).addNegativeCommand(command);
            }
        }
        else{
            ((IControlledCommand)currentCommand).addCommand(command);
        }
    }

    public void exitedCommand(){
        if(commandList.isEmpty()){
            this.resetConditionalManager();
        }
        else{
            commandList.pop();
            if(!commandList.isEmpty()){
                currentCommand = commandList.peek();
                controlType = ((IControlledCommand)currentCommand).getControlType();
                isInControl = true;
            }
            else{
                isInControl = false;
            }
        }
    }

    public static void enteredNegative(){
        isInPositive = false;
    }

    public boolean getIsInPositive() {
        return this.isInPositive;
    }
}
