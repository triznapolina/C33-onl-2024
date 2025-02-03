package lesson_13_homework.task1;

import java.util.Scanner;

public class MainStart {

    //Task 1. Create a class with a static method. This method accepts three
    //parameters as input: login, password, and confirmPassword. WrongPasswordException and WrongLoginException are
    //custom exception classes with two constructors – one by default,
    //the second accepts the exception message and passes it to the constructor of the Exception class.
    //Implement the user's login to the system, taking into account the fact that these fields are of the
    // String data type. Login must be less than 20 characters long and must not contain spaces. If login does not
    //meet these requirements, you must throw a WrongLoginException.
    //The password must be less than 20 characters long, must not contain spaces, and must
    //contain at least one digit. Also, password and confirmPassword must be equal.
    //If the password does not meet these requirements, you must discard it.
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter login: ");
        String login = scanner.nextLine();
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();
        System.out.print("Please confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            boolean isValid = Authorization.logInSystem(login,password,confirmPassword);
            System.out.println("The check was successful!!!" );

            Authorization user = new Authorization(login,password,confirmPassword);
            System.out.println(user);

            scanner.close();
        }
        catch (WrongLoginException e) {
            System.out.println("WrongLoginException: " + e.getMessage());
        }
        catch (WrongPasswordException e) {
            System.out.println("WrongPasswordException: " + e.getMessage());
        }

    }

}
