package analyzer;

import Managers.errors.SemanticErrorManager;
import Managers.symbols.SymbolTableManager;
import antlr.CParser;
import commands.evaluation.AssignmentCommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import representations.PrimitiveType;
import representations.Value;


// Handles all variable declarations, variable initialization, variable re assignment

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
        //Walk the parse tree to get necessary values(id, type, expression?)
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, localVarDecCtx);


        if(SymbolTableManager.getInstance().getCurrentScope().containsVariableAllScopes(id)){
            SemanticErrorManager.getInstance().addSemanticError("Semantic Error("+
                    localVarDecCtx.getStart().getLine()+":"+localVarDecCtx.getStart().getCharPositionInLine()
            + ") Invalid declaration. Variable '" + id + "' is already declared");
        }
        else{
            this.value = new Value(null, primitiveType);
            System.out.println("Created variable " + this.id + " in function " + SymbolTableManager.getInstance().getCurrentScope().getId());
            SymbolTableManager.getInstance().getCurrentScope().addVariable(id,value);
        }

        if(withAssignment){
            System.out.println("Found assignment command in variable declaration. Adding new assignment command in function " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
            AssignmentCommand assignmentCommand = new AssignmentCommand(id, variableExpression);
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(assignmentCommand);
        }
    }

    // For analyzing variables inside a parameter
    public void analyzeParameter(CParser.FormalParameterContext formalParameterContext){
        //
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, formalParameterContext);
        this.value = new Value(expression, primitiveType);
//        SymbolTableManager.getInstance().getCurrentFunction().getFunctionScope().addVariable(id, value);
    }

    public String getId() {
        return id;
    }

    public Value getValue(){
        return value;
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

        //Primitive Types
        if(parserRuleContext instanceof CParser.IntegralTypeContext) { // char, byte, int
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
            //not sure but in order to make sure you can check one level below to check if identifier
            if(parserRuleContext.getChildCount() == 1){
                this.primitiveType = PrimitiveType.STRING;
            }
        }

        // Get variable name
        if(parserRuleContext instanceof CParser.VariableDeclaratorIdContext) {
            this.id = parserRuleContext.getText();
        }
//        if(parserRuleContext instanceof CParser.IdentifierContext) {
//            this.id = parserRuleContext.getText();
//        }

        // Get variable value
        if(parserRuleContext instanceof CParser.VariableInitializerContext) {
            withAssignment = true;
            this.variableExpression = ((CParser.VariableInitializerContext) parserRuleContext).expression();
//            System.err.println("Variable analyzer = " +id+" "+ ((CParser.VariableInitializerContext) parserRuleContext).expression().getText());
            this.expression = parserRuleContext.getText();
        }
//        if(parserRuleContext instanceof CParser.ExpressionContext) {
//            this.expression = parserRuleContext.getText();
//        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
