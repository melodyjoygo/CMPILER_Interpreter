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


        System.out.println("Running Program with the following input: ");
        System.out.println(input);
        System.out.println("=====================End of input=====================");


        // Get generated parse tree
        CParser parser = getParser(input);

        ParserRuleContext parserRuleContext = parser.compilationUnit();
        System.out.println("DEBUG: " + parserRuleContext.toStringTree(parser));


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
                System.out.println("===========Compiled Variables and Initialized Function Stack. Ready to execute.===========");
                Method mainFunction = SymbolTableManager.getInstance().findFunction("main");
                SymbolTableManager.getInstance().setCurrentFunction(mainFunction);
                SymbolTableManager.getInstance().setCurrentScope(mainFunction.getFunctionScope());
                // Add all model.commands.commands of the main function to the execution manager
                for(int i = 0; i < mainFunction.getCommandList().size(); i++ ){
                    ExecutionManager.getInstance().addExecutionList(mainFunction.getCommandList().get(i));
                }

                ExecutionManager.getInstance().execute();

                //Fix mo pa to kasi isang bagsakan yung output mo... pano kung may scan in between
//                for(String outputLogs : outputManager.getOutputLogs()){
////                    System.out.println("output: " + outputLogs);
//                    Text log = new Text(outputLogs.replaceAll("_LINEBREAK_", "\n"));
//                    console.getChildren().add(log);
//                }

                System.out.println("===========End of Execution.===========");
            }
        }

        return;
    }

    public void parseTree(){
        // Get generated parse tree
        String input = codeArea.getText();
        CParser parser = getParser(input);
        ParseTree antlrAST = parser.compilationUnit();

        //show AST in console
        System.out.println(antlrAST.toStringTree(parser));

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
