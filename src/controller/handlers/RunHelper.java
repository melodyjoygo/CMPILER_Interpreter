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

        CParser parser = getParser(input);

        ParserRuleContext parserRuleContext = parser.compilationUnit();


        if(this.syntaxErrorListener.syntaxErrFlag) {
            for(int i = 0; i < syntaxErrorListener.getSyntaxErrors().size(); i++){
                Text error = new Text(syntaxErrorListener.getSyntaxErrors().get(i).replaceAll("_LINEBREAK_", "\n"));
                error.setFill(Color.RED);
                console.getChildren().add(error);
            }
        }
        else{
            CBaseVisitor unoVisitor = new CBaseVisitor<Void>();
            unoVisitor.visit(parserRuleContext);


            if(SemanticErrorManager.getInstance().isErrorFlag()){
                for(String semanticError : SemanticErrorManager.getInstance().getSemanticErrors()){
                    Text error = new Text(semanticError.replaceAll("_LINEBREAK_", "\n"));
                    error.setFill(Color.DARKRED);
                    console.getChildren().add(error);
                }
            }
            else{
                Method mainFunction = SymbolTableManager.getInstance().findFunction("main");
                SymbolTableManager.getInstance().setCurrentFunction(mainFunction);
                SymbolTableManager.getInstance().setCurrentScope(mainFunction.getFunctionScope());
                for(int i = 0; i < mainFunction.getCommandList().size(); i++ ){
                    ExecutionManager.getInstance().addExecutionList(mainFunction.getCommandList().get(i));
                }

                ExecutionManager.getInstance().execute();
            }
        }

        return;
    }

    public void parseTree(){
        String input = codeArea.getText();
        CParser parser = getParser(input);
        ParseTree antlrAST = parser.compilationUnit();

        JFrame frame = new JFrame("Parse Tree");
        JPanel panel = new JPanel();
        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()),antlrAST);
        viewer.setScale(1.5); 
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
        parser.removeErrorListeners();
        this.syntaxErrorListener = new SyntaxErrorListener();
        parser.addErrorListener(this.syntaxErrorListener);

        return parser;
    }
}
