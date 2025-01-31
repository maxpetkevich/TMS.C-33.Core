package lesson13.homework;

public class WrongLoginException extends Exception {
    public WrongLoginException(String msg) {
        super(msg);
    }

    public WrongLoginException() {
        super();
    }
}
