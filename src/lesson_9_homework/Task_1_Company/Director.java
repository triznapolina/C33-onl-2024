package lesson_9_homework.Task_1_Company;

public class Director implements ShowingInformation {

    private String firstName;
    private String lastName;
    private int age;

    public Director (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }


    @Override
    public void displayPosition() {
        System.out.println("Hello, I'm a director!");
    }

    @Override
    public String toString() {
        return "firstname:" + firstName + "\nlastname:" + lastName + "\nage:" + age;
    }


}
