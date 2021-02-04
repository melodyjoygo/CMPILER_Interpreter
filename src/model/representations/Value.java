package model.representations;

import java.util.Stack;


public class Value {

    private Stack<Object> defaultValue;
    private Object value;
    private PrimitiveType primitiveType = PrimitiveType.VOID;
    private boolean finalFlag = false;


    public Value(Object value, PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
        this.value = value;
        if(this.primitiveType == PrimitiveType.VOID){

        }
    }

    public void setPrimitiveType(PrimitiveType primitiveType) {
        this.primitiveType = primitiveType;
    }

    public void markFinal() {
        this.finalFlag = true;
    }

    public boolean isFinal() {
        return this.finalFlag;
    }

    public void setValue(Object value) {
        this.value = value;
    }


    private Object attemptTypeCast(String value) {
        switch(this.primitiveType) {
            case CHAR: return Character.valueOf(value.charAt(0));
            case BOOL: return Boolean.valueOf(value);
            case INT:
                String s = value;

                if(s.contains(".")) {
                    String[] split = s.split("[.]");
                    return Integer.valueOf(split[0]);
                } else {
                    return Integer.valueOf(value);
                }
            case FLOAT: return Double.valueOf(value);
            case STRING: return value;
            default: return null;
        }
    }

    public Object getValue() {
        return this.value;
    }

    public PrimitiveType getPrimitiveType() {
        return this.primitiveType;
    }

    public static boolean checkValueType(Object value, PrimitiveType primitiveType) {
        switch(primitiveType) {
            case CHAR:
                return value instanceof Character;
            case BOOL:
                return value instanceof Boolean;
            case INT:
                return value instanceof Integer;
            case FLOAT:
                return value instanceof Double;
            case STRING:
                return value instanceof String;
            case ARRAY:
                return value instanceof Object;
            default:
                return false;
        }
    }

    public void incrementValue(){
        this.value = ((Double.valueOf((String)this.value) + 1) + "");
    }

}
