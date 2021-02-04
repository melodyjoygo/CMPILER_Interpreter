package model.analyzer;

import model.SemanticErrorManager;
import model.SymbolTableManager;
import antlr.CParser;
import model.commands.evaluation.AssignmentCommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import model.representations.PrimitiveType;
import model.representations.Value;


public class VariableAnalyzer implements ParseTreeListener {
    String id;
    PrimitiveType primitiveType = PrimitiveType.fromString("ewan");
    CParser.ExpressionContext variableExpression;
    String expression;
    Value value;
    private boolean withAssignment;

    public VariableAnalyzer(){
        this.withAssignment = false;
    }

    public void analyze(CParser.LocalVariableDeclarationContext localVarDecCtx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, localVarDecCtx);


        if(SymbolTableManager.getInstance().getCurrentScope().containsVariableAllScopes(id)){
            SemanticErrorManager.getInstance().addSemanticError("Semantic Error("+
                    localVarDecCtx.getStart().getLine()+":"+localVarDecCtx.getStart().getCharPositionInLine()
            + ") Invalid declaration. Variable '" + id + "' is already declared");
        }
        else{
            this.value = new Value(null, primitiveType);
            SymbolTableManager.getInstance().getCurrentScope().addVariable(id,value);
        }

        if(withAssignment){
            AssignmentCommand assignmentCommand = new AssignmentCommand(id, variableExpression);
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(assignmentCommand);
        }
    }

    public void analyzeParameter(CParser.FormalParameterContext formalParameterContext){
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, formalParameterContext);
        this.value = new Value(expression, primitiveType);
    }

    public String getId() {
        return id;
    }

    public Value getValue(){
        return value;
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

        if(parserRuleContext instanceof CParser.IntegralTypeContext) { 
            this.primitiveType = PrimitiveType.fromString(parserRuleContext.getText());
        }
        if(parserRuleContext instanceof CParser.FloatingPointTypeContext) {
            this.primitiveType = PrimitiveType.FLOAT;
        }
        if(parserRuleContext instanceof CParser.UnannPrimitiveTypeContext){
            if(parserRuleContext.getText().equals("boolean")){
                this.primitiveType = PrimitiveType.BOOL;
            }
        }
        if(parserRuleContext instanceof CParser.UnannClassType_lfno_unannClassOrInterfaceTypeContext){
            if(parserRuleContext.getChildCount() == 1){
                this.primitiveType = PrimitiveType.STRING;
            }
        }

        if(parserRuleContext instanceof CParser.VariableDeclaratorIdContext) {
            this.id = parserRuleContext.getText();
        }

        if(parserRuleContext instanceof CParser.VariableInitializerContext) {
            withAssignment = true;
            this.variableExpression = ((CParser.VariableInitializerContext) parserRuleContext).expression();
            this.expression = parserRuleContext.getText();
        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        //
    }
}
