package model.analyzer;

import model.SymbolTableManager;
import antlr.CParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import model.representations.PrimitiveType;
import model.representations.Method;
import model.representations.Value;

import java.util.LinkedHashMap;

public class FunctionDeclarationAnalyzer implements ParseTreeListener {

    PrimitiveType resultType;
    String functionName;
    LinkedHashMap<String, Value> parameters;
    Method function;

    public FunctionDeclarationAnalyzer(){
        parameters = new LinkedHashMap<>();
    }

    public void analyze(CParser.FunctionDeclarationContext functionDeclarationContext){
        PrimitiveType resultType = PrimitiveType.fromString(functionDeclarationContext.methodHeader().result().getText()); 
        String functionName = functionDeclarationContext.methodHeader().methodDeclarator().identifier().getText(); 
        System.out.println("Function declaration: " + functionName);
        function = new Method(functionName,null,resultType);

        SymbolTableManager.getInstance().addFunction(functionName, function);
        SymbolTableManager.getInstance().setCurrentFunction(function);
        SymbolTableManager.getInstance().setCurrentScope(function.getFunctionScope());

        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, functionDeclarationContext);

        // Set the parameters in order to reassign them at function call
        function.initParameters(parameters);
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        //
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        //
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof CParser.FormalParameterContext){
            CParser.FormalParameterContext formalParameterContext = (CParser.FormalParameterContext) parserRuleContext;
            VariableAnalyzer variableAnalyzer = new VariableAnalyzer();
            variableAnalyzer.analyzeParameter(formalParameterContext);
            this.parameters.put(variableAnalyzer.getId(), variableAnalyzer.getValue());
        }

        if(parserRuleContext instanceof CParser.MethodBodyContext) {
            CParser.BlockContext blockCtx = ((CParser.MethodBodyContext) parserRuleContext).block();
            BlockAnalyzer blockAnalyzer = new BlockAnalyzer(this.function.getFunctionScope());
            blockAnalyzer.analyze(blockCtx);
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        //
    }
}
