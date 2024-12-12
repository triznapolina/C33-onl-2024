package lesson_5_homework;

import java.util.Arrays;
import java.util.Scanner;

public class GuessWord {

    public static void main(String[] args) {
        // 1. Welcoming statement
        // 2. Instruction -> if you consider to play, enter y -> next step, if n -> leave
        // 2.1. if leave -> finish the game
        // 2.2. if move on ->
        // 3. Let's have a set of words and try to guess this words
        // 4. We need to offer a player to guess a word or a letter
        // 5. If one letter has been entered -> guess a letter
        // 5.1. if more than one letter has been entered -> guess the word
        // 6. If you have guessed a word, check, YOU WON
        // 6.1. Ask would you like to play again and repeat the whole game
        // 6.2. If not, continue
        // 7. If you have guessed a letter, move on until all letters are opened
        // 7.1. If you have not guessed a letter ask to repeat
        // Проверка на повторы - если у меня в массиве две Р, три А, они все должны быть показаны
        // Открыты и больше он не должен на них реагировать или же сказать, что вы уже эту букву открыли
        startGame();
    }

    public static void startGame() {
        welcome();

        char[] hiddenWord = getHiddenWord().toCharArray();
        char[] openWord = new char[hiddenWord.length];
        Arrays.fill(openWord, 0, openWord.length, '*');

        playOrNot();

        while (true) {
            if (getInput().nextLine().equals("y")) {

                getMessagePlay();
                printWord(openWord);
                System.out.println();
                getInputMsg();

                while (true) {
                    String input = getInput().nextLine();

                    if (input.length() == 0) {

                        System.out.print("You have entered no value. Please, re-enter: ");
                        continue;
                    } else if (input.length() == 1) {

                        checkLetter(input, hiddenWord, openWord);
                        if (Arrays.equals(hiddenWord, openWord)) {
                            System.out.println("\u001B[33m" + "Congratulations! You have guessed the word."
                                    + "\u001B[0m");
                            playAgain();
                            break;
                        }
                        System.out.print("Guess a letter or a word: ");
                    }
                    else if (input.length() > 1) {
                        if (checkWord(input, hiddenWord)) {
                            System.out.println("\u001B[33m" + "Congratulations! You have guessed the word."
                                    + "\u001B[0m");
                            playAgain();
                            break;
                        }
                        System.out.print("You have entered no value. Please, re-enter: ");
                    }
                }
            } else {
                System.out.println("\u001B[35m" + "You have decided to leave a game... GOODBYE!" + "\u001B[0m");
                return;
            }
        }
    }

    public static void playAgain() {
        System.out.print("Would you like to play again? (y/n): ");
        Scanner scanner = getInput();
        String input = scanner.nextLine();
        if (input.equals("y")) {
            startGame();
        } else {
            System.out.println("\u001B[35m" + "You have decided to leave a game... GOODBYE!" + "\u001B[0m");
        }
    }

    public static void welcome() {
        System.out.println("\u001B[34m");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to Guess a Word Game by TMS.");
        System.out.println("The instructions are the following.");
        System.out.println("If you enter a letter, we will check if there is a match.");
        System.out.println("If there is, we open it on the table and game moves on.");
        System.out.println("If not, repeat and try to guess a letter.");
        System.out.println("If you have guessed all letters, you HAVE WON.");
        System.out.println("If you enter two or more characters than we check a word fully.");
        System.out.println("If you guessed the word, you HAVE WON.");
        System.out.println("If not, you continue the game.");
        System.out.println("------------------------------------------------------------------" + "\u001B[0m");
    }

    public static void playOrNot() {
        System.out.println("\u001B[31m" + "------------------------------------------------------------------");
        System.out.print("If you want to play, enter y or any other value to leave: " + "\u001B[0m");
    }

    public static String getHiddenWord() {
        String[] words = {"apple", "banana", "cherry", "dog", "elephant", "fish", "grape", "house",
                "ice cream", "juice"};
        return words[(int) (Math.random() * words.length)];
    }
    public static void printWord(char[] openWord) {
        for (char c : openWord) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static Scanner getInput() {
        return new Scanner(System.in);
    }

    public static void getInputMsg() {
        System.out.print("Guess a letter or a word: ");
    }

    public static boolean checkLetter(String input, char[] hiddenWord, char[] openWord) {
        boolean isGuessed = false;
        for (int i = 0; i < hiddenWord.length; i++) {
            if (input.charAt(0) == hiddenWord[i]) {
                if (openWord[i] != input.charAt(0)) {
                    openWord[i] = hiddenWord[i];
                    isGuessed = true;
                } else {
                    System.out.println("The same entered letter...");
                }
            }
        }

        if (isGuessed) {
            System.out.println("Yes, there is a letter '" + input + "' in the word.");
            printWord(openWord);
        } else {
            System.out.println("Sorry, there is no letter '" + input + "' in the word.");
        }
        return false;
    }


    public static boolean checkWord(String input, char[] hiddenWord) {
        if (input.equals(new String(hiddenWord))) {
            System.out.println("\u001B[33m\t" + "Congratulations! YOU HAVE WON!" + "\u001B[0m");
            return true;
        } else {
            System.out.println("\u001B[33m\t" +"Sorry, the word you have entered is not correct."+ "\u001B[0m");
            return false;
        }
    }

    public static void getMessagePlay() {
        System.out.println("Let's play!");
    }
}



