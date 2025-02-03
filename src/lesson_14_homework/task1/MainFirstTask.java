package lesson_14_homework.task1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainFirstTask {

    public static void main(String[] args) {

        setTheFirstTask();

    }

    public static void setTheFirstTask() {

        StringBuilder content = new StringBuilder();
        String longestWord = "";

        try (FileReader inputFile = new FileReader("src/lesson_14_homework/task1/RomeoandJuliet.txt")) {
            int i;
            System.out.println("Input file text: ");
            while ((i = inputFile.read()) != -1) {
                content.append((char) i);
                System.out.print(( char) i);
            }
            System.out.println("\n------------------------\nOpen OutputFile");

        }
        catch (FileNotFoundException e) {
            System.out.println("File was not found: " + e.getMessage());
        }
        catch (IOException e){
            System.out.println("IO Exception: " + e.getMessage());
        }



        String[] words = content.toString().split("\\W+");
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }


        try (FileWriter outputFile = new FileWriter("src/lesson_14_homework/task1/outputfile.txt")) {
            outputFile.write("The longest word is: " + longestWord);
        } catch (IOException e) {
            System.out.println("IO Exception during writing: " + e.getMessage());
        }


    }


}
