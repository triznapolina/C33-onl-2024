package lesson_20_homework.task2;

public class SortingChoice implements Runnable{

    private int[] array;

    public SortingChoice(int[] array){
        this.array = array;
    }

    public void run() {
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    minIndex = j;
                    min = array[j];
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }

    }

    public int[] getSortedArray() {
        return array;
    }

}
