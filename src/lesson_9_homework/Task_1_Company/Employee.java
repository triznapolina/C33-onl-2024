package lesson_9_homework.Task_1_Company;

public class Employee implements ShowingInformation{

    private String firstName;
    private String lastName;
    private int age;

    public Employee (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    @Override
    public void displayPosition() {
        System.out.println("Hello, I'm a employee!");
    }

    @Override
    public String toString() {
        return "firstname:" + firstName + "\nlastname:" + lastName + "\nage:" + age;
    }

}
