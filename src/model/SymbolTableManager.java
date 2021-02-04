package model;

import model.representations.Method;

import java.util.HashMap;

public class SymbolTableManager {

    private static Scope currentScope;
    private static Method currentFunction;

    private static HashMap<String, Method> functions;

    private static SymbolTableManager sharedInstance = null;


    public static SymbolTableManager getInstance(){
        if(sharedInstance == null){
            sharedInstance = new SymbolTableManager();
            currentScope = new Scope("first", null);
            functions = new HashMap<>();
        }

        return sharedInstance;
    }

    public void resetSymbolTableManager(){
        sharedInstance = null;
        currentScope = null;
        functions = null;
    }

    public void setCurrentScope(Scope scope){
        this.currentScope = scope;
    }

    public Scope getCurrentScope() {
        return this.currentScope;
    }


    public Method getCurrentFunction(){
        return this.currentFunction;
    }

    public void setCurrentFunction(Method function){
        this.currentFunction = function;
    }

    public void addFunction(String functionName, Method function){
        this.functions.put(functionName, function);
    }

    public Method findFunction(String functionName){
        return this.functions.get(functionName);
    }

    public boolean doesFunctionExist(String functionName){
        return this.functions.containsKey(functionName);
    }

    public HashMap<String, Method> getFunctions(){
        return this.functions;
    }

}
