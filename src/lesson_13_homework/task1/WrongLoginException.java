package lesson_13_homework.task1;

public class WrongLoginException extends Exception {

    public WrongLoginException() {
        super("Incorrect login");
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
