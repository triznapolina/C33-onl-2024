package lesson_10_homework;

public class MainUser {
    public static void main(String[] args) {
        User user1 = new User("polina", "java");
        User user2 = new User("polina", "java");
        User user3 = new User("maria", "java");

        System.out.println("User 1: " + user1);
        System.out.println("User 2: " + user2);
        System.out.println("User 3: " + user3);

        System.out.println("-------------------------------------------------");
        System.out.println("user 1's data equal to user 2's? :" + user1.equals(user2));
        System.out.println("user 1's data equal to user 3's? :" + user1.equals(user3));
    }
}
