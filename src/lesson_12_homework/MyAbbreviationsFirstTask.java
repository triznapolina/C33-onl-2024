package lesson_12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyAbbreviationsFirstTask {

    //Task 1. Output all abbreviations to the console from the line that the user enters from the keyboard.
    //An abbreviation is a word from 2 to 6 characters, consisting
    //only of uppercase letters, without numbers. // only English characters
    public static void main(String[] args) {

        System.out.println("Please, enter line: ");
        String input = new Scanner(System.in).nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z]{2,6}\\b");
        Matcher matcher = pattern.matcher(input);

        boolean isFound = false;

        while (matcher.find()) {
            isFound = true;
        }

        if (isFound) {
            System.out.println("Result:");
            matcher.reset();
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } else {
            System.out.println("Not found");
        }

    }

}
