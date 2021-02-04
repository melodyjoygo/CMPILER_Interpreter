package model.analyzer;

import model.CommandControlManager;
import model.SymbolTableManager;
import antlr.CParser;
import model.commands.controlled.ForUpToCommand;
import model.commands.controlled.IfCommand;
import model.commands.controlled.WhileCommand;
import model.commands.evaluation.AssignmentCommand;
import model.commands.simple.ReturnCommand;


public class StatementAnalyzer {
    public StatementAnalyzer(){

    }

    public void analyze(CParser.StatementContext statementCtx) {
        System.out.println(statementCtx.getText() + "analyze statement model.analyzer.analyzer");
        //If statement
        if (statementCtx.ifThenStatement() != null) {
            CParser.IfThenStatementContext ifThenStatementContext = statementCtx.ifThenStatement();
            IfCommand ifCommand = new IfCommand(ifThenStatementContext.expression());

            //Call command control manager to instantiate the if command
            CommandControlManager.getInstance().initializeCommand(ifCommand, ifCommand.getControlType());

        }
        // if else statement
        else if(statementCtx.ifThenElseStatement() != null){
            CParser.IfThenElseStatementContext ifThenElseStatementContext = statementCtx.ifThenElseStatement();
            IfCommand ifCommand = new IfCommand(ifThenElseStatementContext.expression());

            //Call command control manager to instantiate the if command
            CommandControlManager.getInstance().initializeCommand(ifCommand, ifCommand.getControlType());
        }
        // while statement
        else if(statementCtx.whileStatement() != null){
            CParser.WhileStatementContext whileStatementContext = statementCtx.whileStatement();
            WhileCommand whileCommand = new WhileCommand(whileStatementContext.expression());

            CommandControlManager.getInstance().initializeCommand(whileCommand, whileCommand.getControlType());
        }
        // for up to statement
        else if(statementCtx.forUpToStatement() != null){
            CParser.IdentifierContext identifierContext = statementCtx.forUpToStatement().identifier();
            CParser.ExpressionContext expressionContext = statementCtx.forUpToStatement().expression();

            ForUpToCommand forUpToCommand = new ForUpToCommand(identifierContext, expressionContext);
            CommandControlManager.getInstance().initializeCommand(forUpToCommand, forUpToCommand.getControlType());
        }

        else if(statementCtx.statementWithoutTrailingSubstatement() != null){

            // return statement
            if(statementCtx.statementWithoutTrailingSubstatement().returnStatement() != null){
                CParser.ExpressionContext expressionContext = statementCtx.statementWithoutTrailingSubstatement().returnStatement().expression();
                ReturnCommand returnCommand = new ReturnCommand(expressionContext, SymbolTableManager.getInstance().getCurrentFunction());
                BlockAnalyzer.addCommand(returnCommand, "Return command in ");
            }
            //empty statement
            if(statementCtx.statementWithoutTrailingSubstatement().emptyStatement() != null){
                // do nothing
            }
            else if(statementCtx.statementWithoutTrailingSubstatement().expressionStatement() != null){
                // Assignment
                if (statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment() != null) {
                    CParser.AssignmentContext assignmentContext = statementCtx.statementWithoutTrailingSubstatement().expressionStatement().statementExpression().assignment();
                    AssignmentCommand assignmentCommand = new AssignmentCommand(assignmentContext.leftHandSide(), assignmentContext.expression());

                    //If currently in control command, add command to the control
                    BlockAnalyzer.addCommand(assignmentCommand, "Variable assignment in ");
                }
            }
        }

    }
}
