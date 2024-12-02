package lesson_4_homework;

import java.util.Scanner;
import java.util.Random;


public class OneDimensionalArrays {
    public static void main(String[] args){

        SetAnArray();
        SetTheStarTask();

    }

    // Enter task: Для всех задач исходные условия следующие: пользователь с клавиатуры вводит размер
    //массива (просто целое число). После того как размер массива задан, заполнить его
    //одним из двух способов: используя Math.random(), или каждый элемент массива вводится
    //пользователем вручную. Попробовать оба варианта.
    public static void SetAnArray(){

        System.out.print("Please, enter the size of array ");

        Scanner input = new Scanner(System.in);
        int sizeValue = input.nextInt();   // size of array

        int[] enterArray = new int[sizeValue]; // initializing an array

        /*
        for (int i = 0; i<sizeValue; i++) {
            enterArray[i] = (int) (Math.random() * 10); // random numbers from 0 to 10, class Math
        }
        */

        Random random = new Random();   //using class Random, not Math
        for (int i = 0; i < enterArray.length; i++){
            enterArray[i] = random.nextInt(0, 10);
        }

        /*
        for (int i = 0; i<sizeValue; i++) {  // by enter element from keywords
            System.out.print("Please, enter element [" + i + "] : ");
            enterArray[i] = input.nextInt();
        }
        */

        System.out.println("Result array:"); // direct output
        for (int element : enterArray){
            System.out.print(element + "\t");
        }
        System.out.print("\n----------------------------------------------");

        boolean isRunning = true;

        while (isRunning) {

            System.out.print("\nEnter the task number: 1, 2, 3, 4, 5 or 6? ");
            int taskNumber = input.nextInt();
            switch (taskNumber) {
                case 1:
                    // Task 1. Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
                    System.out.println("-- Task 1.");

                    System.out.println("Direct order of the array elements:"); // direct output
                    for (int i = 0; i < enterArray.length; i++){
                        System.out.print(enterArray[i] + "\t");
                    }

                    System.out.println("\nReverse order of the array elements:"); // reserve output
                    for (int i = enterArray.length - 1; i >= 0; i--) {
                        System.out.print(enterArray[i] + "\t");
                    }
                    System.out.print("\n----------------------------------------------");
                    break;
                case 2:
                    // Task 2. Найти минимальный-максимальный элементы и вывести в консоль.
                    System.out.println("-- Task 2.");

                    int minElementOfArray = enterArray[0];
                    int maxElementOfArray = enterArray[0];

                    for (int i = 0; i < enterArray.length; i++) {
                        if (minElementOfArray > enterArray[i]) {
                            minElementOfArray = enterArray[i];
                        }
                        else if (maxElementOfArray < enterArray[i]) {
                            maxElementOfArray = enterArray[i];
                        }
                    }

                    System.out.println("Min element of array is " + minElementOfArray);
                    System.out.println("Max element of array is " + maxElementOfArray);
                    System.out.print("----------------------------------------------");
                    break;
                case 3:

                    // Task 3. Найти индексы минимального и максимального элементов и вывести в консоль.
                    System.out.println("-- Task 3.");

                    //finding the minimum and maximum element
                    minElementOfArray = enterArray[0];
                    maxElementOfArray = enterArray[0];

                    for (int i = 0; i < enterArray.length; i++) {
                        if (minElementOfArray > enterArray[i]) {
                            minElementOfArray = enterArray[i];
                        }
                        else if (maxElementOfArray < enterArray[i]) {
                            maxElementOfArray = enterArray[i];
                        }
                    }

                    // counting indexes number
                    int minCount = 0;
                    int maxCount = 0;

                    for (int i = 0; i < enterArray.length; i++) {
                        if (enterArray[i] == minElementOfArray) {
                            minCount++;
                        }
                        if (enterArray[i] == maxElementOfArray) {
                            maxCount++;
                        }
                    }

                    // Initializing arrays for indexes
                    int[] minIndexes = new int[minCount];
                    int[] maxIndexes = new int[maxCount];

                    int minIndex = 0;
                    int maxIndex = 0;

                    // Filling arrays
                    for (int i = 0; i < enterArray.length; i++) {
                        if (enterArray[i] == minElementOfArray) {
                            minIndexes[minIndex] = i;
                            minIndex++;
                        }
                        if (enterArray[i] == maxElementOfArray) {
                            maxIndexes[maxIndex] = i;
                            maxIndex++;
                        }
                    }

                    // Output of arrays
                    System.out.print("Min indexes of elements: ");
                    for (int i = 0; i < minIndexes.length; i++) {
                        System.out.print(minIndexes[i]);
                        if (i < minIndexes.length - 1) {
                            System.out.print(", "); // the order of the output with ','
                        }
                    }

                    System.out.print("\nMax indexes of elements: ");
                    for (int i = 0; i < maxIndexes.length; i++) {
                        System.out.print(maxIndexes[i]);
                        if (i < maxIndexes.length - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.print("\n----------------------------------------------");
                    break;

                case 4:
                    // Task 4. Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
                    //сообщение, что их нет
                    System.out.println("-- Task 4.");

                    int valueCountZero = 0;
                    //checking values for 0
                    for (int elements : enterArray) {
                        if (elements == 0) {
                            valueCountZero++; // increment for increase values of valueCountZero
                        }
                    }

                    if (valueCountZero > 0) {
                        System.out.println("Quantity of zero elements: " + valueCountZero);
                    } else {
                        System.out.println("There are no zero elements...");
                    }
                    System.out.print("----------------------------------------------");
                    break;

                case 5:
                    // Task 5. Пройти по массиву и поменять местами элементы первый и последний, второй и
                    //предпоследний и т.д.
                    System.out.println("-- Task 5.");

                    for (int i = 0; i < enterArray.length / 2; i++) {
                        int currentValueNumber = enterArray[i]; // assigning a value to the current variable
                                                                         // at a distance of the length array
                        enterArray[i] = enterArray[enterArray.length - 1 - i];
                        enterArray[enterArray.length - 1 - i] = currentValueNumber;
                    }

                    // Output of the sorting (iterating over the elements)
                    System.out.println("Result of sorting arrays: ");
                    for (int element : enterArray) {
                        System.out.print(element + "\t");
                    }

                    System.out.print("\n----------------------------------------------");
                    break;
                case 6:
                    // Task 6. Проверить, является ли массив возрастающей последовательностью (каждое следующее
                    //число больше предыдущего).

                    System.out.println("-- Task 6.");

                    boolean isIncreasing = true;
                    for (int i = 1; i < enterArray.length; i++) {
                        if(enterArray[i]<=enterArray[i-1]){ // checking for decreasing elements
                            isIncreasing = false;
                            break;
                        }
                    }
                    if(isIncreasing){
                        System.out.println("The array is an increasing sequence");
                    } else {
                        System.out.println("The array isn't an increasing sequence");
                    }

                    System.out.print("----------------------------------------------");
                    break;

                default:
                    isRunning = false;
                    System.out.println("Close program task...");
                    System.out.print("----------------------------------------------\n");
                    break;

            }

        }
        input.close();  // close Scanner input
    }


    // (*) Task. Имеется массив из неотрицательных чисел(любой). Представьте что массив
    //представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
    //добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
    //содержит нуля в начале, кроме самого числа 0.
    public static void SetTheStarTask(){
        System.out.println("-- * Task.");

        Random random = new Random();
        int[] enterArray = new int[3];

        for (int i = 0; i < enterArray.length; i++) {
            enterArray[i] = random.nextInt(10);
        }

        System.out.print("Array: [");
        for (int i = 0; i < enterArray.length; i++) {
            System.out.print(enterArray[i]);
            if (i < enterArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int n = enterArray.length;
        for (int i = n - 1; i >= 0; i--) {
            if (enterArray[i] < 9) {
                enterArray[i]++; // iterator of increasing the value by one or '+ 1'
                break;
            }
            enterArray[i] = 0; // overflow - 0
            if (i == 0) { //checking for 9
                int[] nineArrayView = new int[n + 1];
                nineArrayView[0] = 1;

            }
        }

        //Output
        System.out.print("Result of add: [");
        for (int i = 0; i < enterArray.length; i++) {
            System.out.print(enterArray[i]);
            if (i < enterArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");




    }


}







