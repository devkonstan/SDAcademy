package lut16.pl.sda.sandbox;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException() {

    }

    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
