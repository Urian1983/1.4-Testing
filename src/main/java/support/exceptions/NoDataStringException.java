package support.exceptions;

public class NoDataStringException extends Exception{
    public NoDataStringException() {
        super("you must enter a text");
    }
}
