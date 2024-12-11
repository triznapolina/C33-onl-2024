package lesson_5_homework;

import com.sun.jdi.connect.Connector;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        SetTheFirstTask();
        SetTheSecondTask();
        SetTheStarTask();

    }

    // Task 1:
    //1.1 Создать двумерный массив, заполнить его случайными числами.
    //1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
    //1.3 Найти сумму всех получившихся элементов и вывести в консоль.
    public static void SetTheFirstTask() {
        // 1.1
        System.out.println("---------------------1.1-------------------------");
        System.out.print("Enter amount of columns: ");
        Scanner input = new Scanner(System.in);
        int amountColumns = input.nextInt();

        System.out.print("Enter amount of rows: ");
        int amountRows = input.nextInt();

        int [][] twoDimArray = new int [amountRows][amountColumns];
        Random random = new Random();

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++){
                twoDimArray[i][j] = random.nextInt(1,10);
                System.out.print(twoDimArray[i][j] + "\t");
            }
            System.out.println();
        }

        // 1.2
        System.out.println("---------------------1.2-------------------------");
        System.out.print("Enter the number what to add every element: ");
        int enterNumberValue = input.nextInt();
        for (int[] elementRowOfTwoDimArray : twoDimArray) {
            for(int element : elementRowOfTwoDimArray) {
                System.out.print(element + enterNumberValue + "\t");
            }
            System.out.println();
        }

        // Add different number to every element
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print("Enter the number to add to the " + twoDimArray[i][j] + ": ");
                int enterAddNumberValue = input.nextInt();
                twoDimArray[i][j] += enterAddNumberValue;
            }
        }
        System.out.println(Arrays.deepToString(twoDimArray)); // deepToString() to output array

        //1.3
        System.out.println("---------------------1.3-------------------------");
        int totalSum = 0;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                totalSum += twoDimArray[i][j];
            }
        }
        System.out.println("Sum of all elements is " + totalSum);

    }

    public static void SetTheSecondTask () {

        System.out.println("---------------------2-------------------------");
        String[][] elementChessBoard = new String[8][8];

        for (int i = 0; i < elementChessBoard.length; i++) {
            for (int j = 0; j < elementChessBoard[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    elementChessBoard[i][j] = "W";
                }
                else elementChessBoard[i][j] = "B";
            }
        }

        for (String[] chessRow: elementChessBoard) {
            for (String chess: chessRow) {
                System.out.print(chess + "\t");
            }
            System.out.println();
        }


    }

    public static void SetTheStarTask () {
        System.out.println("---------------------3-------------------------");
        System.out.print("Enter amount of rows: ");
        Scanner input = new Scanner(System.in);
        int amountRows = input.nextInt();

        System.out.print("Enter amount of columns: ");
        int amountColumns = input.nextInt();

        int [][] twoDimArray = new int [amountRows][amountColumns];

        int currentValue = 0;
        for (int i = 0; i < amountRows; i++) {
            for (int j = 0; j < amountColumns; j++) {
                if (i % 2 == 0) {
                    twoDimArray[i][j] = currentValue++;
                } else {
                    twoDimArray[i][amountColumns - 1 - j] = currentValue++;
                }
            }
        }

        for (int[] elementRowOfTwoDimArray : twoDimArray) {
            for(int element : elementRowOfTwoDimArray) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }


    }


}
