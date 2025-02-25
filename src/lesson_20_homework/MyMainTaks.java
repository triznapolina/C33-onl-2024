package lesson_20_homework;

import lesson_20_homework.task1.ThreadMaximum;
import lesson_20_homework.task1.ThreadMinimum;
import lesson_20_homework.task2.BubbleSorting;
import lesson_20_homework.task2.SortingChoice;
import lesson_20_homework.task2.SortingInserts;

import java.util.Arrays;
import java.util.Scanner;

public class MyMainTaks {


    // Function setTheFirstAndSecondTasks() for input array, in main function threads start working
    // - Task 1. Package: task 1 - Thread Class get maximum in ThreadMaximum,Thread Class get minimum in ThreadMinimum;
    // - Task 2. Package: task 2 - Thread Class of insertion sort in SortingInserts,
    // Thread Class of Selection sort in SortingChoice, Thread Class of bubble sort in BubbleSorting;
    public static void main(String[] args) throws InterruptedException {


        int[] arrayNumbers = setTheFirstAndSecondTasks();

        System.out.println("-Task 1----------------------");
        ThreadMaximum firstThread = new ThreadMaximum(arrayNumbers);
        ThreadMinimum secondThread = new ThreadMinimum(arrayNumbers);
        firstThread.start();
        secondThread.start();
        firstThread.join();
        secondThread.join();
        System.out.println("Maximum element: " + firstThread.getMax());
        System.out.println("Minimum element: " + secondThread.getMin());

        System.out.println("-Task 2----------------------");
        SortingInserts sort1 = new SortingInserts(arrayNumbers);
        SortingChoice sort2 = new SortingChoice(arrayNumbers);
        BubbleSorting sort3 = new BubbleSorting(arrayNumbers);
        Thread firstTh = new Thread(sort1);
        Thread secondTh = new Thread(sort2);
        Thread thirdTh = new Thread(sort3);
        firstTh.start();
        secondTh.start();
        thirdTh.start();
        firstTh.join();
        secondTh.join();
        thirdTh.join();
        System.out.println("Insertion sort: " + Arrays.toString(sort1.getSortedArray()));
        System.out.println("Selection sort: " + Arrays.toString(sort2.getSortedArray()));
        System.out.println("Bubble sort: " + Arrays.toString(sort3.getSortedArray()));


        System.out.println("-Task *----------------------");










    }


    public static int[] setTheFirstAndSecondTasks(){

        System.out.print("Please enter the size of array: ");
        int sizeArray = new Scanner(System.in).nextInt();

        int[] arrayNumbers = new int[sizeArray];

        for (int i=0;i<sizeArray;i++){
            System.out.print("Please enter element with index " + i + ": ");
            arrayNumbers[i] = new Scanner(System.in).nextInt();
        }

        System.out.println("Input array: " + Arrays.toString(arrayNumbers));

        return arrayNumbers;


    }


}


