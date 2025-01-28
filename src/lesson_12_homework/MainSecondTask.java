package lesson_12_homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainSecondTask {

    // Task *. The program receives an arbitrary text as input. This text may contain a
    //document number (one or more), an email, and a phone number. Document number in the format:
    //xxxx-xxxx-xx, where x is any digit; phone number in the format: +(xx)xxxxxxx. The document
    //may not contain all the information, i.e., for example, it may not contain
    //a phone number, or something else.
    public static void main(String[] args) {

        System.out.println("Please, enter text:");
        String inputText = new Scanner(System.in).nextLine();

        String emailPattern = "[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
        Pattern emailRegex = Pattern.compile(emailPattern);
        Matcher emailMatcher = emailRegex.matcher(inputText);

        String documentPattern = "\\d{4}-\\d{4}-\\d{2}";
        Pattern documentRegex = Pattern.compile(documentPattern);
        Matcher documentMatcher = documentRegex.matcher(inputText);

        String phonePattern = "\\+\\d{2}\\(\\d{7}\\)";
        Pattern phoneRegex = Pattern.compile(phonePattern);
        Matcher phoneMatcher = phoneRegex.matcher(inputText);


        boolean isEmailFound = false;
        while (emailMatcher.find()) {
            System.out.println("Email: " + emailMatcher.group());
            isEmailFound = true;
        }
        if (!isEmailFound) {
            System.out.println("Email is not found ");
        }


        boolean isDocumentFound = false;
        while (documentMatcher.find()) {
            System.out.println("Document number: " + documentMatcher.group());
            isDocumentFound = true;
        }
        if (!isDocumentFound) {
            System.out.println("Document number is not found ");
        }


        boolean isPhoneFound = false;
        while (phoneMatcher.find()) {
            System.out.println("Phone number: " + phoneMatcher.group());
            isPhoneFound = true;
        }
        if (!isPhoneFound) {
            System.out.println("Phone number is not found ");
        }
    }

}
