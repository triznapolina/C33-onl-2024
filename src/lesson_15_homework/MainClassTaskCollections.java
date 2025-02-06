package lesson_15_homework;

import java.util.*;

public class MainClassTaskCollections {

    public static void main(String[] args) {

        setTheFirstTak();
        setTheSecondTask();
        setTheThirdTask();
        setTheStarTask();
    }


    //Task 1. Implementing the second task, the user enters a set of numbers as a single string from the keyboard.
    //For example: "1, 2, 3, 4, 4, 5". Get rid of duplicate elements in the row. To display the result on the screen.
    //When deciding to use collections.
    public static void setTheFirstTak() {

        try {
            System.out.print("Enter number's line (f.e format: 1,2,2,3): ");
            String inputLine = new Scanner(System.in).nextLine();

            String[] numbersArray = inputLine.split(",");

            List<Integer> values = new ArrayList<>();

            for (String number : numbersArray) {
                values.add(Integer.parseInt(number.trim()));
            }
            System.out.println("Input line: " + values);

            Set<Integer> valueSet = new LinkedHashSet<>(values);
            List<Integer> valuesWithoutDoubles = new ArrayList<>(valueSet);

            System.out.println("--------------------------------");
            System.out.println("Line without duplicates: " + valuesWithoutDoubles);
        } catch (Exception e){
            System.out.println("Exception: " + e.getMessage());
        }


    }

    //Implementation of the second task, Animal class
    public static void setTheSecondTask() {

        Animal animalCollection = new Animal();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("-------------------------");
            System.out.print("Please choose action: \n1 - Add animal\n2 - Delete animal" +
                    "\n3 - Display animal list\n4 - Exit \nYour choose: ");

            String command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.println("-------------------------");
                    System.out.print("Please enter animal name to add: ");
                    String inputAnimalName = scanner.nextLine();
                    animalCollection.addAnimal(inputAnimalName);
                    animalCollection.displayAnimals();
                    break;
                case "2":
                    System.out.println("-------------------------");
                    animalCollection.deleteAnimal();
                    System.out.print("Result: ");
                    animalCollection.displayAnimals();
                    break;
                case "3":
                    System.out.println("-------------------------");
                    animalCollection.displayAnimals();
                    break;
                case "4":
                    System.out.println("-------------------------");
                    System.out.println("Exiting the program");
                    scanner.close();
                    return;
                default:
                    System.out.println("-------------------------");
                    System.out.println("Invalid command. Please enter a number from 1 to 4.");
                    break;
            }
        }


    }


    //Implementation of the third task, Student class
    public static void setTheThirdTask() {

        Student firstStudent = new Student("Tryzna Polina", "15-d",3,
                new int[] { 9, 8, 9, 9, 8 });
        Student secondStudent = new Student("Ivanov Ivan", "2-f", 2,
                new int[] { 3, 1, 1, 2, 1 });
        Student thirdStudent = new Student("Petryshkin Vlad", "52-a", 3,
                new int[] { 9, 9, 10, 4, 5 });
        Student forthStudent = new Student("Pirogov Ivan", "11-w", 1,
                new int[] { 1, 2, 1, 2, 3 });
        Student fifthStudent = new Student("Solnseva Violetta", "s12-g", 1,
                new int[] { 2, 9, 10, 8, 9 });

        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(firstStudent,secondStudent,
                thirdStudent,forthStudent,fifthStudent));

        System.out.println("All student's: ");
        Student.print(students);
        System.out.println("----------------------------");

        System.out.println("Student's of 1 course: ");
        Student.printStudents(students, 1);
        System.out.println("Student's of 2 course: ");
        Student.printStudents(students, 2);
        System.out.println("Student's of 3 course: ");
        Student.printStudents(students, 3);
        System.out.println("----------------------------");

        Student.deleteStudents(students);
        System.out.println("Students with an average score of more than three and get new course:");
        Student.print(students);

    }


    //Implementation of the star task, CustomArrayList class
    public static void setTheStarTask() {

        System.out.println("----------------------------");
        CustomArrayList<String> customList = new CustomArrayList<>();

        customList.add("apple");
        customList.add("banana");
        customList.add("cherry");
        System.out.println(customList);

        System.out.println("Element at index 1: " + customList.get(1));

        System.out.println("Contains 'banana': " + customList.contains("banana"));
        System.out.println("Contains 'orange': " + customList.contains("orange"));

        customList.remove(1);
        System.out.println("After removal element with index 1: " + customList);

        customList.clear();
        System.out.println("--Cleaning collection--");
        System.out.println(customList);


    }


}
