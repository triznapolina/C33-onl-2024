package lesson_13_homework.task1;

public class WrongPasswordException extends Exception {

    public WrongPasswordException() {
        super("Incorrect password");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
