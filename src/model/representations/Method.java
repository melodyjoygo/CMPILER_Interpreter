package model.representations;

import model.Scope;
import model.SymbolTableManager;
import model.commands.ICommand;

import java.util.*;

public class Method {
    private String functionName;
    private LinkedHashMap<String, Value> parameters;
    private ArrayList<ICommand> commandList;
    private Scope functionScope;
    private PrimitiveType returnType;
    private Value returnValue;

    public Method(String functionName, LinkedHashMap<String, Value> parameters, PrimitiveType returnType){
        this.functionName = functionName;
        this.parameters = parameters;
        this.returnType = returnType;
        this.commandList = new ArrayList<>();
        this.functionScope = new Scope(functionName+"-scope",null);
        this.returnValue = new Value(null, returnType);
        SymbolTableManager.getInstance().setCurrentScope(functionScope);
    }

    public Value getReturnValue(){
        return this.returnValue;
    }
    public String getFunctionName(){
        return this.functionName;
    }


    public void initParameters(LinkedHashMap<String, Value> parameters){
        this.parameters = parameters;
        for(int i = 0; i < this.parameters.size(); i++) {
            Value value = (Value) this.parameters.values().toArray()[i];
            this.functionScope.addVariable((String) this.parameters.keySet().toArray()[i], value);
        }
    }

    public void setParameters(ArrayList<Value> parameterValue){
        if(parameterValue.size() != this.parameters.size()){
        }
        else{
            for(int i = 0; i < this.parameters.size(); i++) {
                Value value = (Value) this.parameters.values().toArray()[i];
                value.setValue(parameterValue.get(i).getValue());
                this.functionScope.reAssignVariable((String) this.parameters.keySet().toArray()[i], value);
            }


        }
    }

    public Scope getFunctionScope(){
        return this.functionScope;
    }

    public void addCommand(ICommand command){
        commandList.add(command);
    }

    public ArrayList<ICommand> getCommandList(){
        return this.commandList;
    }

}
