package OBJECT_MASKING.exceptions;

public class WrongNumberOfElementsException extends RuntimeException {

    public WrongNumberOfElementsException() {}

    public WrongNumberOfElementsException(String message) {
        super(message);
    }
}
