package lesson_14_homework.taskStar;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainDocumentTask {

        public static void main(String[] args) {
            setTheStarTask();
        }

        // Task Star. Let's say there is a txt file with document numbers. The document number is a string
        //consisting of letters and numbers (without service characters). Let this file contain each
        //document number from a new line and no other information in the line, just
        //the document number. A valid document number must be 15 characters long and begin with
        //the sequence 'docnum' (hereinafter any sequence of letters/numbers) or
        //'contract' (hereinafter any sequence of letters/numbers). Write a program to read
        //information from the input file - the path to the input file must be set via
        //the console. The program should check the document numbers for validity. Valid
        //document numbers should be recorded in a single report file. Invalid document numbers
        //should be written to another report file, but after the document numbers,
        //information should be added about why this document is not valid.

        public static void setTheStarTask() {

            // File path is "D:\курсы\опп\lab\src\lesson_14_homework\taskStar\documentsFileInput.txt"
            System.out.print("Please enter file input path: ");
            String inputFilePath = new Scanner(System.in).nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                 BufferedWriter validWriter = new BufferedWriter
                         (new FileWriter("src/lesson_14_homework/taskStar/valid_documents.txt"));
                 BufferedWriter invalidWriter = new BufferedWriter
                         (new FileWriter("src/lesson_14_homework/taskStar/invalid_documents.txt"))) {

                String documentNumber;
                while ((documentNumber = reader.readLine()) != null) {
                    documentNumber = documentNumber.trim();
                    if (isValidDocumentNumber(documentNumber)) {
                        validWriter.write(documentNumber);
                        validWriter.newLine();
                    } else {
                        invalidWriter.write(documentNumber + " Invalid document number: must begin with " +
                                "'docnum' or 'contract', the length is strictly 15 characters, " +
                                "without special characters");
                        invalidWriter.newLine();
                    }
                }

                System.out.println("The verification is completed. " +
                        "The results have been successfully written to files!");

            } catch (FileNotFoundException e){
                System.out.println("File was not found: " + e.getMessage());
            } catch (IOException e){
                System.out.println("IOExceptionn says: " + e.getMessage());
            }

        }

        private static boolean isValidDocumentNumber(String documentNumber) {
            return Pattern.matches("^(docnum[A-Za-z0-9]{9}|contract[A-Za-z0-9]{7})$", documentNumber);
        }


}
