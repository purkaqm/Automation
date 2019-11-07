package pages.exception;

public class NoMSTeamsException extends Exception{
    public NoMSTeamsException() {
    }

    public NoMSTeamsException(String message) {
        super(message);
    }

    public NoMSTeamsException(String message, Throwable cause) {
        super(message, cause);
    }
}
