package tests;

public class TitleNotFoundException extends Exception {
    public TitleNotFoundException() {
    }

    public TitleNotFoundException(String message) {
        super(message);
    }

    public TitleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
