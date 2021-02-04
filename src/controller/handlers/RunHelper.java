package controller.handlers;

import model.SemanticErrorManager;
import model.ExecutionManager;
import model.OutputManager;
import model.SymbolTableManager;
import antlr.CBaseVisitor;
import antlr.CLexer;
import antlr.CParser;
import model.checkers.SyntaxErrorListener;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import model.representations.Method;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class RunHelper {
    ArrayList<String> syntaxErrors;
    CodeArea codeArea;
    TextFlow console;


    SyntaxErrorListener syntaxErrorListener;

    public RunHelper(CodeArea codeArea, TextFlow console){
        this.codeArea = codeArea;
        this.console = console;
        this.syntaxErrors = new ArrayList<>();
    }


    public void run(){
        //Delete previous logs
        console.getChildren().clear();
        String input = codeArea.getText();
        //Reinstantiate Execution Manager and Symbol Table Manager
        ExecutionManager.getInstance().resetExecutionManager();
        SymbolTableManager.getInstance().resetSymbolTableManager();
        SemanticErrorManager.getInstance().resetSemanticErrorManager();

        OutputManager.getInstance().setConsole(console);
        OutputManager.getInstance().resetOutputManager();
        OutputManager.getInstance().setConsole(console);

        // if((input.indexOf("x = 2")!=-1) && (input.indexOf("y = 2")!=-1) && (input.indexOf("z = 2")!=-1) ){
        //     OutputManager.getInstance().addoutputLog("Value is: 32.0");
        //     //System.out.println("32!");
        // }
        // else if((input.indexOf("x = -1")!=-1) && (input.indexOf("y = -2")!=-1) && (input.indexOf("z = -3")!=-1)){
        //     OutputManager.getInstance().addoutputLog("Value is: -24.0");
        //     //System.out.println("32!");
        // }
        // else if((input.indexOf("x = 1")!=-1) && (input.indexOf("y = 1")!=-1) && (input.indexOf("z = x+1")!=-1)){
        //     OutputManager.getInstance().addoutputLog("Value is: 40.0");
        //     //System.out.println("32!");
        // }
        // else if((input.indexOf("x = 0")!=-1) && (input.indexOf("y = 0")!=-1) && (input.indexOf("z = 0")!=-1)){
        //     OutputManager.getInstance().addoutputLog("Value is: 44.0");
        //     //System.out.println("32!");
        // }
            

        CParser parser = getParser(input);

        ParserRuleContext parserRuleContext = parser.compilationUnit();


        if(this.syntaxErrorListener.syntaxErrFlag) {
            //If there are syntax model.checkers, add model.checkers to the log
            for(int i = 0; i < syntaxErrorListener.getSyntaxErrors().size(); i++){
                Text error = new Text(syntaxErrorListener.getSyntaxErrors().get(i).replaceAll("_LINEBREAK_", "\n"));
                error.setFill(Color.RED);
                console.getChildren().add(error);
            }
        }
        else{
            //Check for semantic model.checkers and fill up SymbolTable, CommandTable
            CBaseVisitor unoVisitor = new CBaseVisitor<Void>();
            unoVisitor.visit(parserRuleContext);

            //Add Symbol Tokens to the debugger


            //If semantic model.checkers exist add model.checkers to logs
            if(SemanticErrorManager.getInstance().isErrorFlag()){
                for(String semanticError : SemanticErrorManager.getInstance().getSemanticErrors()){
                    Text error = new Text(semanticError.replaceAll("_LINEBREAK_", "\n"));
                    error.setFill(Color.DARKRED);
                    console.getChildren().add(error);
                }
            }
            //Else execute all model.commands.commands in the command stack
            else{
                Method mainFunction = SymbolTableManager.getInstance().findFunction("main");
                SymbolTableManager.getInstance().setCurrentFunction(mainFunction);
                SymbolTableManager.getInstance().setCurrentScope(mainFunction.getFunctionScope());
                // Add all model.commands.commands of the main function to the execution manager
                for(int i = 0; i < mainFunction.getCommandList().size(); i++ ){
                    ExecutionManager.getInstance().addExecutionList(mainFunction.getCommandList().get(i));
                }

                ExecutionManager.getInstance().execute();
            }
        }

        return;
    }

    public void parseTree(){
        // Get generated parse tree
        String input = codeArea.getText();
        CParser parser = getParser(input);
        ParseTree antlrAST = parser.compilationUnit();

        //show AST in GUI
        JFrame frame = new JFrame("Parse Tree");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),antlrAST);
        viewer.setScale(1.5); // Scale a little
        panel.add(viewer);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private CParser getParser(String input){

        CharStream charStream = CharStreams.fromString(input);
        CLexer lexer = new CLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CParser parser = new CParser(tokens);
        // Syntax Error Handling
        parser.removeErrorListeners();
        this.syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(this.syntaxErrorListener);

        return parser;
    }
}
