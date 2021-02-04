package model.commands.simple;

import model.OutputManager;
import model.SymbolTableManager;
import antlr.CParser;
import model.commands.ICommand;
import model.representations.PrimitiveType;
import model.representations.Value;

public class ScanCommand implements ICommand {
    String identifier;
    String text;

    public ScanCommand(CParser.ExpressionContext expression, CParser.IdentifierContext identifier) {
        this.text = expression.getText();
        this.identifier = identifier.getText();
    }

    @Override
    public void execute() {
        String value = OutputManager.getInstance().getInput(text);
        Value newValue = new Value(value, PrimitiveType.STRING);
        SymbolTableManager.getInstance().getCurrentScope().reAssignVariable(identifier, newValue);
    }
}
