package model.analyzer;

import model.CommandControlManager;
import model.Scope;
import model.SymbolTableManager;
import antlr.CParser;
import model.commands.ICommand;
import model.commands.simple.FunctionCallCommand;
import model.commands.simple.PrintCommand;
import model.commands.simple.ScanCommand;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

//(method body context) - Handles initalizing the local scope for code blocks (inside classes, inside functions, inside loops)
public class BlockAnalyzer implements ParseTreeListener {

    public BlockAnalyzer(){
        //Creates a new scope under the current scope
        Scope newScope = new Scope(SymbolTableManager.getInstance().getCurrentScope());
        SymbolTableManager.getInstance().setCurrentScope(newScope);
    }

    public BlockAnalyzer(Scope scope){
        //For function calls and main scope should already be created
    }

    public void analyze(CParser.BlockContext ctx) {
        ParseTreeWalker treeWalker = new ParseTreeWalker();
        treeWalker.walk(this, ctx);
        SymbolTableManager.getInstance().setCurrentScope(SymbolTableManager.getInstance().getCurrentScope().getParentScope());
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
//        System.out.println(terminalNode.getSymbol() + " " + terminalNode.getSymbol().getText() + " " + CParser.ELSE);
        if(terminalNode.getSymbol().getText().equals("else")){
            System.out.println("Entered negative");
            CommandControlManager.getInstance().enteredNegative();
        }
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof CParser.LocalVariableDeclarationStatementContext) {
//            System.out.println("Variable Declaration");
            CParser.LocalVariableDeclarationContext variableContext = ((CParser.LocalVariableDeclarationStatementContext)parserRuleContext).localVariableDeclaration();
            VariableAnalyzer variableAnalyzer = new VariableAnalyzer();
            variableAnalyzer.analyze(variableContext);
        }
        else if(parserRuleContext instanceof CParser.StatementContext){
            CParser.StatementContext statementContext = ((CParser.StatementContext)parserRuleContext);
            StatementAnalyzer statementAnalyzer = new StatementAnalyzer();
            statementAnalyzer.analyze(statementContext);
        }
        else if(parserRuleContext instanceof CParser.FunctionCallerContext){
//            System.out.println("Function call: " + parserRuleContext.getText() + " in " + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
//            ((CParser.FunctionCallerContext) parserRuleContext).identifier();
            if(parserRuleContext.getText().substring(0,6).equals("print(")){
                addCommand(new PrintCommand((CParser.FunctionCallerContext) parserRuleContext), "Print command in ");
//                SymbolTableManager.getInstance().getCurrentFunction().addCommand(new PrintCommand((CParser.FunctionCallerContext) parserRuleContext));
            }
            else if (parserRuleContext.getText().substring(0,5).equals("scan(")){
                addCommand(new ScanCommand(((CParser.FunctionCallerContext) parserRuleContext).expression(), ((CParser.FunctionCallerContext) parserRuleContext).identifier()), "Scan command in ");
            }
        }
        else if(parserRuleContext instanceof CParser.MethodInvocationContext){
            //add funtion call command to function
            addCommand(new FunctionCallCommand((CParser.MethodInvocationContext) parserRuleContext), "Function call command in ");
//            SymbolTableManager.getInstance().getCurrentFunction().addCommand(new FunctionCallCommand((CParser.MethodInvocationContext) parserRuleContext));
        }

        else{

        }
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
        if(parserRuleContext instanceof CParser.IfThenStatementContext){
            //Leaves the if command sana gumana yung recursion amp
            System.out.println("Leaving if command");
            CommandControlManager.getInstance().exitedCommand();
            //CommandControlManager.getInstance().resetConditionalManager();
        }
        if(parserRuleContext instanceof CParser.IfThenElseStatementContext){
            //Leaves the if command sana gumana yung recursion amp
            System.out.println("Leaving if else command");
            CommandControlManager.getInstance().exitedCommand();
        }
        if(parserRuleContext instanceof CParser.WhileStatementContext){
            //Leaves the if command sana gumana yung recursion amp
            System.out.println("Leaving while command");
            CommandControlManager.getInstance().exitedCommand();
        }
        if(parserRuleContext instanceof CParser.ForUpToStatementContext){
            System.out.println("Leaving for up to command");
            CommandControlManager.getInstance().exitedCommand();
        }
    }


    static void addCommand(ICommand command, String message) {
        //IsControlled is used to identify if its a controlled command or not when add

        //If it is inside a controlled command let it be handled by the command control manager
        if(CommandControlManager.getInstance().isControl()){
            System.out.println(message + "controlled command");
            CommandControlManager.getInstance().addCommand(command);
        }
        // Else add it directly to the function command list
        else{
            System.out.println(message + SymbolTableManager.getInstance().getCurrentFunction().getFunctionName());
            SymbolTableManager.getInstance().getCurrentFunction().addCommand(command);
        }
    }
}
