package lesson_9_homework.Task_1_Company;

public class MyMainCompany {

    public static void main(String[] args) {

        Accountant accountant = new Accountant("Ivan", "Setrov",32);
        Director director = new Director("Fedor", "Davidov", 44);
        Employee employee = new Employee("Kirill", "Abrikosov", 21);

        System.out.println(accountant);
        accountant.displayPosition();
        System.out.println("-------------------------");
        System.out.println(director);
        director.displayPosition();
        System.out.println("-------------------------");
        System.out.println(employee);
        employee.displayPosition();

    }

}
