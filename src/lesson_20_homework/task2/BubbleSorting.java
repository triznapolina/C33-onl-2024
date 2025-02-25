package lesson_20_homework.task2;

import java.util.stream.IntStream;

public class BubbleSorting implements Runnable{

    private int[] array;

    public BubbleSorting(int[] array){
        this.array = array;
    }

    public void run() {
        int n = array.length;
        IntStream.range(0, n - 1).flatMap(i -> IntStream.range(1, n - i)).forEach(j -> {
                    if (array[j - 1] > array[j]) {
                        int temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                });

    }

    public int[] getSortedArray() {
        return array;
    }

}
