package exceptions;

public class MySuperException extends RuntimeException {

    String myMessage;

    public MySuperException(String myMessage) {
        this.myMessage = myMessage;
    }

    @Override
    public void printStackTrace() {
        System.err.println("My exceptions message");
        super.printStackTrace();
    }
}
