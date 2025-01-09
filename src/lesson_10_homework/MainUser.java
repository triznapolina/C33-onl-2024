package lesson_10_homework;

import java.util.Scanner;

public class MainUser {

    private static User[] users = new User[3];

    public static void main(String[] args) throws CloneNotSupportedException {

        initializeUsers();

        for (User  user : users) {
            System.out.println("User: " + user);
        }

        System.out.println("-------------------------------------------------");
        System.out.println("user 1's data equal to user 2's? :" + users[0].equals(users[1]));
        System.out.println("user 1's data equal to user 3's? :" + users[0].equals(users[2]));


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person's id: ");
        int userId = scanner.nextInt();
        scanner.nextLine();

        User originalUser  = findUserById(userId);
        if (originalUser  == null) {
            System.out.println("User  was not found");
            return;
        }

        System.out.println("Before clone:");
        System.out.println(originalUser );

        System.out.print("Enter type (shallow/deep)? :");
        String cloneType = scanner.nextLine();

        User clonedUser  = null;
        try {
            if ("shallow".equalsIgnoreCase(cloneType)) {
                clonedUser  = (User) originalUser .clone();
            } else if ("deep".equalsIgnoreCase(cloneType)) {
                clonedUser  = originalUser .deepClone();
            } else {
                System.out.println("Enter shallow or deep not other");
                return;
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("After clone:");
        System.out.println(clonedUser);
    }

    private static void initializeUsers() {
        users[0] = new User(1, "polina", "java");
        users[1] = new User(2, "polina", "java");
        users[2] = new User(3, "ivan", "programmer");
    }

    private static User findUserById(int id) {
        for (User  user : users) {
            if (user != null && user.getIdUser () == id) {
                return user;
            }
        }
        return null;
    }

}









