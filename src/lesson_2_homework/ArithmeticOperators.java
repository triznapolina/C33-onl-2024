package lesson_2_homework;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args){ // arguments

        SetTheFirstTask();
        SetTheSecondTask();
        SetTheThirdTask();
        SetTheForthTask();
        SetTheFifthTask();
        SetTheStarTask();
        SetTheSecondMethodForStarTask();
    }


    // Task 1. Написать приложение, которое будет вычислять значение по формуле: a=4*(b+c-1)/2;
    // b и c задаем в коде самостоятельно.
    public static void SetTheFirstTask(){
        System.out.println("-- Task 1:");
        double valueB = 24.5;
        double valueC = 2.8;
        double resultOfExpression = 4 * (valueB+valueC-1)/2; // Format expression for values
        System.out.println("Result of calculation:" + resultOfExpression);
        System.out.println("----------------------------------------------");

    }

    // Task 2. Создайте программу, вычисляющую и выводящую на экран сумму цифр n, где n - двузначное число.
    public static void SetTheSecondTask(){
        System.out.println("-- Task 2:");

        boolean isTrue = true; // while for checking the correct data format of valueN
        while (isTrue) {

            System.out.print("Please, enter number: ");
            int valueN = new Scanner(System.in).nextInt();

            //checking for a positive value of valueN
            if (valueN > 0) {

                //checking the number valueN for double digits
                if ( valueN >= 10 && valueN <= 99 ) {
                    isTrue = false;
                    int unitDigitValue = valueN % 10; //finding the category of unit digit
                    int tensDigitValue = valueN / 10 % 10; //finding the category of tens digit
                    int sumOfDigit = unitDigitValue + tensDigitValue;
                    System.out.println("Result of sum is " + tensDigitValue + " + " +
                            unitDigitValue + " = " + sumOfDigit); // sum of digits of valueN number
                    System.out.println("----------------------------------------------");

                }
                else {
                    System.out.println("Enter a double figures number");

                }

            }
            else {
                System.out.println("Enter a positive number");
            }

        }

    }


    // Task 3. Создайте программу, вычисляющую и выводящую на экран сумму цифр n, где n - трехзначное число.
    public static void SetTheThirdTask(){

        System.out.println("-- Task 3:");

        boolean isTrue = true; // while for checking the correct data format of valueN
        while (isTrue) {

            System.out.print("Please, enter number: ");
            int valueN = new Scanner(System.in).nextInt();

            //checking for a positive value of valueN
            if (valueN > 0) {

                //checking the number valueN for double digits
                if ( valueN >= 100 && valueN <= 999) {
                    isTrue = false;
                    int unitDigitValue = valueN % 10; //finding the category of unit digit
                    int tensDigitValue = valueN / 10 % 10; //finding the category of tens digit
                    int hundredthDigitValue = valueN / 100; //finding the category of hundredths digit
                    int sumOfDigit = unitDigitValue + tensDigitValue + hundredthDigitValue;
                    System.out.println("Result of sum is " + hundredthDigitValue + " + " + tensDigitValue + " + "
                            + unitDigitValue + " = " + sumOfDigit); // sum of digits of valueN number
                    System.out.println("----------------------------------------------");

                }
                else {
                    System.out.println("Enter a three figures number");
                }
            }
            else {
                System.out.println("Enter a positive number");
            }
        }

    }

    // Task 4. В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
    //программу, округляющую число n до ближайшего целого и выводящую результат на
    //экран
    public static void SetTheForthTask(){
        System.out.println("-- Task 4:");

        boolean isTrue = true; // while checking for the correct data format of valueReal
        while (isTrue) {

            System.out.print("Please, enter number: ");
            double valueReal = new Scanner(System.in).nextDouble();

            //checking the fractional valueReal
            if (valueReal % 1 != 0) {
                isTrue = false;
                int valueInt = (int) Math.round(valueReal); //type conversion using the rounding function of class Math
                System.out.println("Result of rounding: " + valueInt);
                System.out.println("----------------------------------------------");

            }
            else {
                System.out.println("Enter a number with a fractional part");
            }
        }

    }

    //Task 5. В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
    //на экран результат деления q на w с остатком.
    public static void SetTheFifthTask(){

        System.out.println("-- Task 5:");

        // format of division is dividend / divisor = quotient
        System.out.print("Please, enter the dividend number: ");
        int dividendValue = new Scanner(System.in).nextInt(); // q in the task

        boolean divisorValueTrue = true;

        while (divisorValueTrue) {

            System.out.print("Please, enter the divisor number: ");
            int divisorValue = new Scanner(System.in).nextInt(); // w in the task

            if (divisorValue != 0) {
                divisorValueTrue = false;
                int divideValue = dividendValue / divisorValue;//looking for the result of division
                int remainderValue = dividendValue % divisorValue; //looking for the remainder of the division

                if (remainderValue != 0){
                    System.out.println("Result of division is: " + dividendValue + " / " + divisorValue + " = "
                            + divideValue + "  with remainder " + remainderValue);
                    System.out.println("----------------------------------------------");

                }
                else {
                    System.out.println("Result of division is: " + dividendValue + " / " + divisorValue + " = "
                            + divideValue + "\nThere is zero remainder from division...");
                    System.out.println("----------------------------------------------");

                }

            }
            else {
                System.out.println("You can't divide by zero");
            }

        }


    }


    // (*) Task. Написать программу, которая будет менять местами значение целочисленных переменных.
    public static void SetTheStarTask(){

        System.out.println("-- * Task. First method:");
        System.out.print("Please, enter first number ");
        int valueFirstNumber = new Scanner(System.in).nextInt();

        System.out.print("Please, enter second number ");
        int valueSecondNumber = new Scanner(System.in).nextInt();

        int valueThirdNumber = valueFirstNumber;  // enter a new variable for redefining values
        valueFirstNumber = valueSecondNumber;
        valueSecondNumber = valueThirdNumber;

        System.out.println("First number is " + valueFirstNumber);
        System.out.println("Second number is " + valueSecondNumber);

    }


    // Усовершенствовать программу задачи со звездочкой, использовать только 2 входные переменные (a, b)
    public static void SetTheSecondMethodForStarTask(){

        System.out.println("--Second method:");
        System.out.print("Please, enter first number ");
        int valueFirstNumber = new Scanner(System.in).nextInt();

        System.out.print("Please, enter second number ");
        int valueSecondNumber = new Scanner(System.in).nextInt();

        // XOR by 2 variables
        valueFirstNumber = valueFirstNumber ^ valueSecondNumber;
        valueSecondNumber = valueFirstNumber ^ valueSecondNumber;
        valueFirstNumber = valueFirstNumber ^ valueSecondNumber;

        System.out.println("First number is " + valueFirstNumber);
        System.out.println("Second number is " + valueSecondNumber);


    }


}




