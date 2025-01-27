package lesson_11_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MyStrings {

    private String firstLine;
    private String secondLine;
    private String thirdLine;

    public MyStrings(String firstLine, String secondLine, String thirdLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        this.thirdLine = thirdLine;

    }

    @Override
    public String toString() {
        return "MyStrings{" +
                "firstLine='" + firstLine + '\'' +
                ", secondLine='" + secondLine + '\'' +
                ", thirdLine='" + thirdLine + '\'' +
                '}';
    }


    // Task 1. find the shortest and longest strings. Output the found strings and their length
    public void SetTheFirstTask () {

        System.out.println("-------------------------------------");

        String[] lines = {firstLine, secondLine, thirdLine};

        String shortestLine = lines[0];
        String longestLine = lines[0];

        for (String line : lines) {
            if (line.length() < shortestLine.length()) {
                shortestLine = line;
            } else if (line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        System.out.println("Shortest line: " + shortestLine + " (" + shortestLine.length() + " characters)");
        System.out.println("Longest line: " + longestLine + " (" + longestLine.length() + " characters)");

    }


    //Task 2. arrange and display the rows in ascending order of their length values
    public void SetTheSecondTask () {

        System.out.println("-------------------------------------");

        String[] lines = {firstLine, secondLine,thirdLine};

        // use the sort method to sort an array of the Array class, to sort strings by length using the Comparator
        // comparison interface, Comparator.comparingInt(String::length) to extract the length value of the
        // String class string for which the comparison is performed
        Arrays.sort(lines, Comparator.comparingInt(String::length));

        //output the result in string, toString()
        System.out.println(Arrays.toString(lines));


    }


    //Task 3. output to the console those lines whose length is less than the average, as well as their length
    public void SetTheThirdTask () {

        System.out.println("-------------------------------------");

        String[] lines = {firstLine, secondLine,thirdLine};

        int totalLength = 0;
        for (String line : lines) {
            totalLength += line.length();
        }
        int averageLength = totalLength / 3;
        System.out.println("Average line is " + averageLength + "\nLines that are shorter in length:");
        for (String line : lines) {
            if (line.length() < averageLength) {
                System.out.println(line + " (" + line.length() + " characters)");
            }
        }


    }


    //Task 4. find a word consisting only of different characters. If there are several such words,
    // find the first one
    public void SetTheForthTask() {

        System.out.println("-------------------------------------");

        String[] lines = {firstLine, secondLine, thirdLine};

        for (String line : lines) {
            String[] words = line.split(" ");
            String firstUniqueWord = null;
            int uniqueWordCount = 0;

            for (String word : words) {

                if (uniqueSymbolsChecker(word)) {
                    if (firstUniqueWord == null) {
                        firstUniqueWord = word;
                    }
                    uniqueWordCount++;
                }
            }


            if (uniqueWordCount == 0) {
                System.out.println("In the line " + line + " there are no words consisting only of " +
                        "different characters");
            } else if (uniqueWordCount == 1) {
                System.out.println("In the line " + line + " a word consisting only of various characters: "
                        + firstUniqueWord);
            } else {
                System.out.println("In the line " + line + " a few words consisting only of different characters, " +
                        "the first is: " + firstUniqueWord);
            }
        }

    }

    private static boolean uniqueSymbolsChecker(String word) {
        ArrayList<Character> list = new ArrayList<>();
        char[] chars = word.toCharArray();

        for(char c : chars) {
            if (list.contains(c)) {
                return false;
            } else {
                list.add(c);
            }
        }
        return true;
    }

}
