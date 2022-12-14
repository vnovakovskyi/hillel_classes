package exceptions;

import java.util.Date;

public class SpotifyUserException extends RuntimeException {
    String myMessage;
    Date exceptionTime;

    public SpotifyUserException(String message) {
        super(message);
        this.myMessage = message;
        exceptionTime = new Date();
        logMessage();
    }

    private void logMessage() {

    }
}
