package lesson_9_homework.Company;

public interface ShowingInformation {

    String getTypePosition();

    default void displayPosition() {
        System.out.println("Person's position is " + getTypePosition());

    }
}

