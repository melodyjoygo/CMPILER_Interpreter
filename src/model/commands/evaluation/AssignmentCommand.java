package model.commands.evaluation;

import model.Scope;
import model.SymbolTableManager;
import antlr.CParser;
import model.commands.ICommand;
import model.commands.EvaluateCommand;
import model.representations.Value;

public class AssignmentCommand implements ICommand {

    private CParser.LeftHandSideContext leftHand;
    private CParser.ExpressionContext rightHand;
    private Value value;
    private Scope assignmentScope;
    private boolean inVariableDec;
    private String variableName;

    public AssignmentCommand(CParser.LeftHandSideContext leftHand, CParser.ExpressionContext rightHand) {
        this.leftHand = leftHand;
        this.rightHand = rightHand;
        assignmentScope = SymbolTableManager.getInstance().getCurrentScope();
        inVariableDec = false;
    }

    public AssignmentCommand(String id, CParser.ExpressionContext expressionContext){
        assignmentScope = SymbolTableManager.getInstance().getCurrentScope();
        this.variableName = id;
        this.rightHand = expressionContext;
        inVariableDec = true;
    }

    @Override
    public void execute() {
        if(!inVariableDec){
            EvaluateCommand evaluateCommand = new EvaluateCommand(this.rightHand);
            evaluateCommand.execute();
            Object result = evaluateCommand.evaluateExpression();

            this.value = new Value(result, assignmentScope.findVariableValueAllScopes(leftHand.getText()).getPrimitiveType());
            assignmentScope.reAssignVariable(leftHand.getText(), this.value);
        }
        else{
            EvaluateCommand evaluateCommand = new EvaluateCommand(this.rightHand);
            evaluateCommand.execute();
            Object result = evaluateCommand.evaluateExpression();
            this.value = new Value(result, assignmentScope.findVariableValueAllScopes(variableName).getPrimitiveType());
            assignmentScope.reAssignVariable(variableName, this.value);
        }
    }
}
