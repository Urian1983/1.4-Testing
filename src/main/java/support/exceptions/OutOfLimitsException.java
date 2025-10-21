package support.exceptions;

public class OutOfLimitsException extends Exception{
    public OutOfLimitsException() {
        super("Value out of range");
    }
}
