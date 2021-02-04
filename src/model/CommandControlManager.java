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

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
    public void resetConditionalManager(){ //Call this when leaving a controlled command
=======
    public static void resetConditionalManager(){ //Call this when leaving a controlled command
>>>>>>> parent of c71d38e... last push
=======
    public static void resetConditionalManager(){ //Call this when leaving a controlled command
>>>>>>> parent of c71d38e... last push
=======
    public static void resetConditionalManager(){ 
>>>>>>> parent of f929ae2... Revert "Merge branch 'main' into melody"
        sharedInstance = null;
    }

    public boolean isControl(){
        return this.isInControl;
    }

    public void initializeCommand(ICommand command, IControlledCommand.ControlTypeEnum controlType){
        if(!isInControl){
            System.out.println("Adding controlled command to function: " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(command);
        }
        else{
            System.out.println("Adding controlled command to parent controlled command");
            this.addCommand(command);
        }

        commandList.add(command);
        currentCommand = command;
        isInControl = true;
        isInPositive = true;
        this.controlType = controlType;
    }


    // Add command
    public void addCommand(ICommand command){
        if(this.controlType == IControlledCommand.ControlTypeEnum.CONDITIONAL_IF){
            if(isInPositive){
                System.err.println("Added to positive if");
                ((IConditionalCommand)currentCommand).addPositiveCommand(command);
            }
            else{
                System.err.println("Added to negative if");
                ((IConditionalCommand)currentCommand).addNegativeCommand(command);
            }
        }
        else{
            ((IControlledCommand)currentCommand).addCommand(command);
        }
    }

    public void exitedCommand(){
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        System.out.println("Exited controlled command: " + this.controlType);
=======
        //System.out.println("Exited controlled command: " + this.controlType);
>>>>>>> parent of c71d38e... last push
=======
        //System.out.println("Exited controlled command: " + this.controlType);
>>>>>>> parent of c71d38e... last push
=======
>>>>>>> parent of f929ae2... Revert "Merge branch 'main' into melody"
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
