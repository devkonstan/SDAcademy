package lut10.main.java.pl.sda.advanced.exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException() {

    }

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
