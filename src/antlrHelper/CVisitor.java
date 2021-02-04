package antlrHelper;

import antlr.CBaseVisitor;
import antlr.CParser;

public class CVisitor extends CBaseVisitor<Void> {

    public CVisitor(){

    }

    public void enterVariableDeclaratorList(CParser.VariableDeclaratorListContext ctx) {
        System.out.println("Enter Variable Declarator: " + ctx.toString());
    }

    public void exitVariableDeclaratorList(CParser.VariableDeclaratorListContext ctx) {

    }
}
