package lesson_16_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MainStartTask {

    public static void main(String[] args) {

        //Call 1 task
        System.out.println(wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
        System.out.println("------------------------------");

        //Call 2 task
        System.out.println(pairs(new String[]{"code", "bug"}));
        System.out.println("------------------------------");

        //Call * Task
        System.out.println(formatOutput("()", isBalanced("()")));
        System.out.println(formatOutput("[()]", isBalanced("[()]")));
        System.out.println(formatOutput("{[()]}", isBalanced("{[()]}")));
        System.out.println(formatOutput("([{{[(())]}}])", isBalanced("([{{[(())]}}])")));
        System.out.println(formatOutput("{{[]()}}}}", isBalanced("{{[]()}}}}")));
        System.out.println(formatOutput("{[(])}", isBalanced("{[(])}")));
        System.out.println(formatOutput("{[)}])}", isBalanced("{[)}])}")));
        System.out.println(formatOutput("{()}", isBalanced("{()}")));


    }


    // Task 1. An array of strings is received as input, return Map<String, Boolean>, where each individual
    //string is a key, and its value is true if this string occurs in the array.
    //2 or more times.
    public static Map<String, Boolean> wordMultiple(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();


        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            result.put(word, wordCount.get(word) >= 2);
        }

        return result;
    }



    // Task 2. An array of non-empty strings is received as input, create and return a Map<String,
    //String> as follows: for each string, add its first character
    //as the key with the last character as the value.
    public static Map<String, String> pairs(String[] words) {
        Map<String, String> result = new HashMap<>();

        for (String word : words) {
            if (word.length() > 0) {
                String key = String.valueOf(word.charAt(0));
                String value = String.valueOf(word.charAt(word.length() - 1));

                result.put(key, value);
            }
        }

        return result;
    }


    //Task *. A string is specified that can have parentheses inside it.
    //Any of the following characters is considered a parenthesis — "(", ")", "[", "]", "{", "}". Check
    //the balance of the brackets in this line. A set of parentheses is considered
    //a balanced pair if the opening parenthesis "(", "[" and "{" are to the left of
    //the corresponding closing parenthesis ")", "]" and "}", respectively. A string
    //containing pairs of parentheses is not balanced if the set of parentheses enclosed in it
    //does not match.
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static String formatOutput(String str, boolean result) {
        return str + " : " + result;
    }


}
