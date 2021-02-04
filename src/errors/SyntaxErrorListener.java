package errors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;

public class SyntaxErrorListener extends BaseErrorListener{

    public boolean syntaxErrFlag = false;
    private ArrayList<String> syntaxErrors;
    private int syntaxErrLine = -69;


    public SyntaxErrorListener() {
        this.syntaxErrors = new ArrayList<>();
    }

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg, RecognitionException e) {

        syntaxErrFlag = true;


        List<String> errorList = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(errorList);

        //Cleaning up error messages
        // Checks different instances of Recognition Exceptions
        if(e instanceof InputMismatchException) {
            msg = "Input Mismatch Exception";
        }
        if(e instanceof NoViableAltException) {
            msg = "No Viable Alt Exception";
        }
        if(e instanceof LexerNoViableAltException) {
            msg = "Lexer No Viable Alt Exception";
        }
        if(e instanceof FailedPredicateException) {
            msg = "Failed Predicate Exception";
        }

        //Special cases
        if(msg.contains("extraneous input")) {
            msg = "Extraneous input";
        }
        else if(msg.contains("missing 'up to'")) {
            msg = "Missing 'up to'";
        }
        else if(msg.contains("missing '}'")) {
            msg = "Missing closin curly bracket";
        }
        if(syntaxErrLine != line) {
            System.err.println("Syntax Error(" + line + "," + charPositionInLine + ") : Token '" + ((Token) offendingSymbol).getText() + "' " + msg);
            this.syntaxErrors.add("Syntax Error(" + line + "," + charPositionInLine + ") : Token '" + ((Token) offendingSymbol).getText() + "' " + msg);
            syntaxErrLine = line;
        }
    }

    public ArrayList<String> getSyntaxErrors() {
        return this.syntaxErrors;
    }

    public boolean isSyntaxErrFlag(){
        return this.syntaxErrFlag;
    }
}
