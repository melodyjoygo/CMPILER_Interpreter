package commands.simple;

import Managers.io.OutputManager;
import Managers.symbols.SymbolTableManager;
import antlr.CParser;
import commands.ICommand;
import representations.PrimitiveType;
import representations.Value;

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
