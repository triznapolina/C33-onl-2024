package lesson_6_oop_basic_homework;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeGame {

    private static final char[][] gameTable = createInitializeTable();

    public static void main(String[] args) {
        startGame();
    }


    public static void startGame() {
        getInitialMessage();

        if ((getInputValue().nextLine()).equals("y")){
            System.out.println("---------------------------------------------------------------------------------");
            char[][] gameTable = createInitializeTable();
            drawTable(gameTable);

            int dice = getRandomNumbers().nextInt(0, 9);

            if (dice >= 0 && dice <= 10){
                makePlayerMove();
            } else {
                makeAIMove();
            }


            boolean isRunningGame = true;

            while (isRunningGame) {
                System.out.println("Would you like to continue? (y - Yes, the rest - No: " + "\u001b[2J");
                if ((getInputValue().nextLine()).equals("y")){
                    System.out.println("-------------------------------------------------------------------------------");
                    drawTable(gameTable);
                    clearTable();

                    int newDice = getRandomNumbers().nextInt(0, 9);
                    if (newDice >= 0 && newDice <= 10){
                        makePlayerMove();
                    } else {
                        makeAIMove();
                    }
                }
                else {
                    isRunningGame = false;
                    System.out.println("\u001B[31m\t" + "You have decided to leave the game. GOODBYE!" + "\u001B[0m");
                }
            }


        } else {
            System.out.println("\u001B[31m\t" + "You have decided to leave the game. GOODBYE!" + "\u001B[0m");
        }
    }

    public static char[][] createInitializeTable() {
        return new char[][]{
                {'*', '*', '*'},
                {'*', '*', '*'},
                {'*', '*', '*'}
        };
    }

    public static void getInitialMessage() {
        System.out.println("\u001B[34m\t");
        System.out.println("-------------------------------WELCOME TO TIC-TAC-TOE GAME------------------------------");
        System.out.println("This is the instruction:");
        System.out.println("\tThe game will draw a table.");
        System.out.println("\tAfter it decides who starts the first.");
        System.out.println("\tIf a player starts the game - X.");
        System.out.println("\tIf a AI starts the game, the player will use - O.");
        System.out.print("Would you like to move on?! (y - Yes, the rest - No: " + "\u001B[0m");
    }

    public static void drawTable(char[][] gameTable) {
        System.out.println("\u001B[32m");
        for (char[] outer : gameTable) {
            for (char inner : outer) {
                System.out.print("\t" + inner + "  ");
            }
            System.out.println();
        }
        System.out.println("\u001B[0m");
    }

    public static void clearTable(){
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                gameTable[i][j] = '*';
            }
        }

    }

    public static void makeAIMove() {

        int cellAI = getRandomNumbers().nextInt(0, 3);
        int columnAI = getRandomNumbers().nextInt(0, 3);

        while (gameTable[cellAI][columnAI] != '*') {
            cellAI = getRandomNumbers().nextInt(0, 3);
            columnAI = getRandomNumbers().nextInt(0, 3);
        }

        gameTable[cellAI][columnAI] = 'O';

        System.out.println("AI has decided to make the following move: [" +
                (cellAI + 1) + "][" + (columnAI + 1) + "].");

        drawTable(gameTable);

        checkStatus();
    }

    public static void makePlayerMove() {
        System.out.print("Enter the cell number (1-3): ");
        int cellPlayer = getInputValue().nextInt() - 1;

        System.out.print("Enter the column number (1-3): ");
        int columnPlayer = getInputValue().nextInt() - 1;

        while (gameTable[cellPlayer][columnPlayer] != '*') {
            System.out.print("This cell is already taken. Please, try again cell: ");
            cellPlayer = getInputValue().nextInt() - 1;
            System.out.print("This cell is already taken. Please, try again column: ");
            columnPlayer = getInputValue().nextInt() - 1;
        }

        gameTable[cellPlayer][columnPlayer] = 'X';

        drawTable(gameTable);

        checkStatus();
    }

    public static void checkStatus() {
        if (checkWinner('X')) {
            System.out.println("Congratulations! You have won!");

            return;
        } else if (checkWinner('O')) {
            System.out.println("Sorry, you have lost!");
            return;
        }
        if (NoSide()) {
            System.out.println("No sides!");
            return;
        }


        if (isPlayerTurn()) {
            makePlayerMove();
        } else {
            makeAIMove();
        }
    }

    public static boolean checkWinner(char player) {

        for (int i = 0; i < 3; i++) {
            if (gameTable[i][0] == player && gameTable[i][1] == player && gameTable[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (gameTable[0][j] == player && gameTable[1][j] == player && gameTable[2][j] == player) {
                return true;
            }
        }

        if (gameTable[0][0] == player && gameTable[1][1] == player && gameTable[2][2] == player) {
            return true;
        }

        if (gameTable[0][2] == player && gameTable[1][1] == player && gameTable[2][0] == player) {
            return true;
        }

        return false;
    }

    public static boolean NoSide() {
        for (char[] row : gameTable) {
            for (char cell : row) {
                if (cell == '*') {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isPlayerTurn() {
        int countX = 0;
        int countO = 0;

        for (char[] row : gameTable) {
            for (char cell : row) {
                if (cell == 'X') {
                    countX++;
                } else if (cell == 'O') {
                    countO++;
                }
            }
        }

        return countX <= countO;
    }

    public static Random getRandomNumbers() {
        return new Random();
    }

    public static Scanner getInputValue() {
        return new Scanner(System.in);
    }

}










