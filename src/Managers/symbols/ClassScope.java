//package Managers.symbols;
//
//import representations.CFunction;
//import representations.Value;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class ClassScope implements IScope{
//    //holds public and private variables as separate lists
//    //holds public and private functions as separate lists
//    //holds the parent scope, an instance of local scope, the parent scope pertains to the scope of main
//    // only 1 class can have the main function. Therefore, other classes have the parent scope set to null
//
//    private String id;
//
//    private HashMap<String, Value> publicVariables;
//    private HashMap<String, Value> privateVariables;
//
//    private HashMap<String, CFunction> publicFuntions;
//    private HashMap<String, CFunction> privateFuntions;
//
//    private ArrayList<IScope> childScopes;
//
//    public ClassScope(String id){
//        publicVariables = new HashMap<>();
//        privateVariables = new HashMap<>();
//        publicFuntions = new HashMap<>();
//        privateFuntions = new HashMap<>();
//
//        childScopes = new ArrayList<>();
//    }
//
//    public void addLocalScope(IScope scope){
//        childScopes.add(scope);
//    }
//
//
//    public String getId() {
//        return id;
//    }
//
//    public Value getVariable(String identifer){
//        if(privateVariables.containsKey(identifer)){
//            return privateVariables.get(identifer);
//        }
//
//        if(publicVariables.containsKey(identifer)){
//            return publicVariables.get(identifer);
//        }
//
//        return null;
//    }
//
//    public HashMap<String, Value> getPublicVariables() {
//        return publicVariables;
//    }
//
//    public HashMap<String, Value> getPrivateVariables() {
//        return privateVariables;
//    }
//
//    public HashMap<String, CFunction> getPublicFuntions() {
//        return publicFuntions;
//    }
//
//    public HashMap<String, CFunction> getPrivateFuntions() {
//        return privateFuntions;
//    }
//
//    public ArrayList<IScope> getChildScopes() {
//        return childScopes;
//    }
//}
