package model.commands;


import model.SemanticErrorManager;
import model.SymbolTableManager;
import antlr.CParser;
import com.udojava.evalex.Expression;
import model.commands.simple.FunctionCallCommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
import model.representations.Value;

import java.math.BigDecimal;
import java.util.List;


public class EvaluateCommand implements ICommand, ParseTreeListener {
    private CParser.ExpressionContext expressionContext;

    private String modifiedExpression;
    private boolean isNumeric;
    private boolean hasError;
    private boolean isFunction;

    private Object result;
    public EvaluateCommand(CParser.ExpressionContext expressionContext){
        this.expressionContext = expressionContext;
        this.hasError = false;
        this.isFunction = false;
        this.isNumeric = true;
    }

    @Override
    public void execute() {
        this.modifiedExpression = expressionContext.getText();
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, expressionContext);


        if(isNumeric){
            isNumeric = !this.modifiedExpression.contains("\"") && !this.modifiedExpression.contains("\'");
        }

        if(!hasError){

            if(!isNumeric){

                if (this.modifiedExpression.contains("==") || this.modifiedExpression.contains("!=")) {
                    String[] strings = {"", ""};

                    if (this.modifiedExpression.contains("=="))
                        strings = this.modifiedExpression.split("==");

                    if (this.modifiedExpression.contains("!="))
                        strings = this.modifiedExpression.split("!=");

                    String equalityFunction = "STREQ("+strings[0]+", " + strings[1] + ")";
                    Expression e = new Expression(equalityFunction);

                    e.addLazyFunction(e.new LazyFunction("STREQ", 2){
                        private Expression.LazyNumber ZERO = new Expression.LazyNumber() {
                            public BigDecimal eval() {
                                return BigDecimal.ZERO;
                            }
                            public String getString() {
                                return "0";
                            }
                        };

                        private Expression.LazyNumber ONE = new Expression.LazyNumber() {
                            public BigDecimal eval() {
                                return BigDecimal.ONE;
                            }
                            public String getString() {
                                return null;
                            }
                        };

                        public Expression.LazyNumber lazyEval(List<Expression.LazyNumber> lazyParams) {
                            if (lazyParams.get(0).getString().equals(lazyParams.get(1).getString())) {
                                return ONE;
                            }
                            return ZERO;
                        }
                    });

                    if(e.eval() == BigDecimal.ONE){
                        this.result = "True";
                    }
                    else{
                        this.result = "False";
                    }
                }
                else{
                    String temp = this.modifiedExpression.replaceAll("\\+", "");
                    this.result = temp;
                }
            }

            else{
                BigDecimal e = new Expression(this.modifiedExpression)
                        .setPrecision(3)
                        .eval();
                this.result = e.floatValue() + "";
            }
        }

    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
        //comment
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
        //comment
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

        if(parserRuleContext instanceof CParser.LiteralContext){

        }

        else if(parserRuleContext instanceof CParser.MethodInvocation_lfno_primaryContext){
            this.isFunction = true;

            this.modifiedExpression = (String) new FunctionCallCommand((CParser.MethodInvocation_lfno_primaryContext)parserRuleContext).evaluateFunctionCall().getValue();
            String temp = (String) new FunctionCallCommand((CParser.MethodInvocation_lfno_primaryContext)parserRuleContext).evaluateFunctionCall().getValue();
            this.modifiedExpression.replace(parserRuleContext.getText(), temp);
        }


        else if(parserRuleContext instanceof CParser.IdentifierContext && !isFunction){
            if(SymbolTableManager.getInstance().getCurrentScope().containsVariableAllScopes(parserRuleContext.getText())){
                Value variable = SymbolTableManager.getInstance().getCurrentFunction().getFunctionScope().findVariableValueAllScopes(parserRuleContext.getText());

                String temp = (String) variable.getValue();
                if(temp.contains("\"")){
                    isNumeric = false;
                }

                temp = temp.replaceAll("\"", "");
                temp = temp.replaceAll("'","");

                this.modifiedExpression = this.modifiedExpression.replace(parserRuleContext.getText(), temp);
            }
            else{
                SemanticErrorManager.getInstance().addSemanticError(
                        "Semantic Error("+parserRuleContext.getStart().getLine()+ ":" +parserRuleContext.getStart().getCharPositionInLine()+")" +
                                "Variable '" + parserRuleContext.getText() + "' was not initialized in scope");
                this.hasError = true;
            }
        }

    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        //comment
    }


    public Object evaluateExpression(){
        return result;
    }
}
