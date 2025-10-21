package support.exceptions;

public class RepeatedBookException extends Exception{
    public RepeatedBookException() {
        super("Book already registered");
    }
}
