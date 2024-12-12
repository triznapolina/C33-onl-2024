package lesson_3_homework;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args){ // arguments

        SetTheFirstTask();
        SetTheSecondTask();
        SetTheThirdTask();
        SetTheForthTask();
        SetTheStarTask();

    }


    // Task 1. Напишите программу, которая будет принимать на вход число из консоли и на выход
    //будет выводить сообщение четное число или нет.
    public static void SetTheFirstTask(){
        System.out.println("-- Task 1:");
        System.out.print("Please, enter number: ");
        int numberValue = new Scanner(System.in).nextInt();

        //checking the parity of the remainder for division by 2
        if (numberValue % 2 == 0) {
            System.out.println("This number is even...");
        }
        else System.out.println("This number is odd...");
        System.out.println("----------------------------------------------");

    }


    // Task 2.Для введенного числа t (температура на улице) вывести: Если t>–5, то вывести «Warm».
    //Если –5>= t > –20, то вывести «Normal». Если –20>= t, то вывести «Cold».
    public static void SetTheSecondTask(){
        System.out.println("-- Task 2:");
        System.out.print("Please, enter temperature as number: ");
        int temperatureValue = new Scanner(System.in).nextInt();

        if (temperatureValue > -20 && temperatureValue <= -5) {
            System.out.println("Normal");
        }
        else if (temperatureValue > -5) {
            System.out.println("Warm");
        }
        else System.out.println("Cold");

        System.out.println("----------------------------------------------");

    }


    // Task 3. Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.
    public static void SetTheThirdTask(){
        System.out.println("-- Task 3:");

        int numberValue = 10; // while for square of the numberValue from 10 to 20
        while (numberValue <= 20) {
            System.out.println("The square of the number " + numberValue + " is " + Math.pow(numberValue,2));
            numberValue++; // increment to increase the value of numberValue
        }
        System.out.println("----------------------------------------------");

    }

    // Task 4. Необходимо, чтоб программа выводила на экран вот такую последовательность:
    //7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    public static void SetTheForthTask(){
        System.out.println("-- Task 4:");

        int firstNumberValue = 7;
        System.out.println("Result of sequence: ");
        while (firstNumberValue <= 98){ // while for iterating values from 7 to 98 inclusive
           System.out.print(firstNumberValue + "\t");
           firstNumberValue = firstNumberValue +7; // increase the value of each element of the sequence, add 7
        }
        System.out.print("\n----------------------------------------------------");

    }


    // (*) Task. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    // все числа от 1 до введенного пользователем числа.
    public static void SetTheStarTask(){
        System.out.println("\n-- * Task:");

        boolean isTrueValue = true;
        while (isTrueValue) {
            System.out.print("Please, enter number: ");
            int enterValueNumber = new Scanner(System.in).nextInt();

            if (enterValueNumber > 0) { // checking for positive value

                if (enterValueNumber != 1) { // checking value greater then 1
                    isTrueValue = false; // closing data entry
                    int i = 1;
                    int sumValueSquence = 0; // value of sequence addition
                    for (; i<=enterValueNumber;i++) {  // iterating values from 1 to enterValueNumber
                        System.out.print(i);
                        if (i != enterValueNumber) {   // writing the plus between the sequence
                            System.out.print(" + ");
                        }
                        sumValueSquence += i;  // add a value i to the sum
                    }
                    System.out.println(" = " + sumValueSquence);

                }
                else
                    System.out.println("Result of addition is 1\nPlease, enter value is strictly greater than one...");

            }
            else System.out.println("Please, enter a positive value");

        }


    }


}
