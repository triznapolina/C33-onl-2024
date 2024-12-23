package lesson_9_homework.Company;

public class MyMainCompany {

    public static void main(String[] args) {

        Accountant accountant = new Accountant();
        Director director = new Director();
        Employee employee = new Employee();

        accountant.displayPosition();
        director.displayPosition();
        employee.displayPosition();

    }

}
