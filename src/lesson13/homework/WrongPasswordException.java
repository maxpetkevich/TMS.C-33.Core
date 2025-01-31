package lesson13.homework;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String msg) {
        super(msg);
    }

    public WrongPasswordException() {
        super();
    }
}
