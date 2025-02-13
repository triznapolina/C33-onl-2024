package lesson_17_homewok;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class MainStartTask {

    public static void main(String[] args) {

        SetTheFirstTask();
        SetTheSecondTask();
        SetTheThirdTask();
        SetTheForthTask();
        SetTheFifthTask();

    }


    //Task1. The user enters his date of birth into the console. The program should return the date
    //when the user turns 100 years old. Use the Date/Time API
    public static void SetTheFirstTask(){

        try {
            System.out.println("--Task1-------------------------------");
            System.out.print("Please enter your birthday day (format: yyyy-mm-dd): ");
            String bithdayDay = new Scanner(System.in).nextLine();

            System.out.println("When you turn 100 years old: " +
                    LocalDate.parse(bithdayDay).plus(100, ChronoUnit.YEARS));

        } catch (Exception e){
            System.out.println("Exception:" + e.getMessage());
        }

    }

    //Task2.Using Predicate, among the array of numbers, output only those that are positive.
    public static void SetTheSecondTask(){

        System.out.println("--Task2-------------------------------");
        System.out.print("Please enter the size of array: ");
        int sizeArray = new Scanner(System.in).nextInt();

        int[] arrayNumbers = new int[sizeArray];

        for (int i=0;i<sizeArray;i++){
            System.out.print("Please enter element with index " + i + ": ");
            arrayNumbers[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Input array: " + Arrays.toString(arrayNumbers));

        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println("Positive elements of array: ");
        for(int number: arrayNumbers){
            if (isPositive.test(number)){
                System.out.print(number + "\t");
            }

        }


    }


    //Task3. Using Function, implement a lambda that will include a string in the “*amount* BYN” format
    // (separated by a space, insert any value instead of *amount*), and return the amount immediately
    // converted to dollars.
    public static void SetTheThirdTask(){

        double difference = 2.8;

        Function<String, Double> convertToDollars = input -> {
            if (!input.endsWith("BYN")) {
                throw new IllegalArgumentException("Input string doesn't have currency 'BYN'");
            }
            String[] parts = input.split(" ");
            double amount = Double.parseDouble(parts[0]);
            return amount / difference;
        };

        try {
            System.out.println("\n--Task3-------------------------------");

            System.out.print("Please enter amount of money (format: 'double_number'_ BYN ): ");
            String input = new Scanner(System.in).nextLine();

            double result = convertToDollars.apply(input);

            System.out.println("Input amount: " + input);
            System.out.println("Output convector: " + result + " $");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }



    }


    //Task 4. Using Consumer, implement a lambda that will include a string in
    //the “*amount* BYN” format (separated by a space, insert any value instead of *amount*), and
    //output the amount immediately converted to dollars.
    public static void SetTheForthTask(){

        double difference = 2.8;

        Consumer<String> convertToDollars = input -> {
            if (!input.endsWith("BYN")) {
                throw new IllegalArgumentException("Input string doesn't have currency 'BYN'");
            }

            String[] parts = input.split(" ");

            double amount = Double.parseDouble(parts[0]);
            double result = amount / difference;
            System.out.println("Input amount: " + input);
            System.out.println("Output convector: " + result + " $");

        };

        try {
            System.out.println("--Task4-------------------------------");
            System.out.print("Please enter amount of money (format: 'double_number BYN'): ");
            String input = new Scanner(System.in).nextLine();

            convertToDollars.accept(input);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }


    }


    //Task 5. Using Supplier, write a method that will return the string entered from the console backwards
    public static void SetTheFifthTask() {

        System.out.println("--Task5-------------------------------");
        System.out.print("Please enter string line: ");
        String input = new Scanner(System.in).nextLine();

        Supplier<String> reverseLine = () -> {
            return new StringBuilder(input).reverse().toString();
        };

        System.out.println("Result of reversing: " + reverseLine.get());

    }










}
