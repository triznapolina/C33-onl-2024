package lesson_11_homework;

import java.util.Scanner;

public class MainStart {

    public static void main(String[] args) {


        // Task 1 - 4, work with three lines
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, enter first line: ");
        String firstLine = scanner.nextLine();
        System.out.print("Please, enter second line: ");
        String secondLine = scanner.nextLine();
        System.out.print("Please, enter third line: ");
        String thirdLine = scanner.nextLine();

        MyStrings myStrings = new MyStrings(firstLine, secondLine, thirdLine);
        System.out.println(myStrings);

        myStrings.SetTheFirstTask();
        myStrings.SetTheSecondTask();
        myStrings.SetTheThirdTask();
        myStrings.SetTheForthTask();

        // Task 5. Print a new line to the console, which duplicates each letter from
        //the initial line.
        System.out.println("-Task 5------------------------------------");
        System.out.println("Please, enter line: ");
        String input = scanner.nextLine();
        SetTheFifthTask(input);


        // Task. A string of arbitrary length with arbitrary words is given. Write a program to
        //check whether any selected word in a string is a palindrome.
        System.out.println("-Task *------------------------------------");
        System.out.println("Enter a comma-separated string of words (for example: apple, pear, orange): ");
        String inputLine = scanner.nextLine();
        System.out.println("Enter the number of the checking word: ");
        int wordIndex = scanner.nextInt();
        SetTheStarTask(inputLine, wordIndex);

        scanner.close();
    }




    public static void SetTheFifthTask (String input) {

        StringBuilder resultLine = new StringBuilder();

        for (char c : input.toCharArray()) {
            resultLine.append(c).append(c);
        }

        System.out.println("Result: " + resultLine);

    }


    public static void SetTheStarTask(String input, int index) {

        String[] words = input.split(",");

        if (index < 1 || index > words.length) {
            System.out.println("In the line" + words.length + " words, \nEnter index again ");
            return;
        }

        String wordToCheck = words[index - 1];

        if (isPalindrome(wordToCheck)) {
            System.out.println(wordToCheck.trim() + " is palindrome");
        } else {
            System.out.println(wordToCheck.trim() + " is not palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        String normalizedWord = word.trim().toLowerCase();
        String reversedWord = new StringBuilder(normalizedWord).reverse().toString();
        return normalizedWord.equals(reversedWord);

    }

}
