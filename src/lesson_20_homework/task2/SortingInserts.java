package lesson_20_homework.task2;

public class SortingInserts implements Runnable{

    private int[] array;


    public SortingInserts(int[] array){
        this.array = array;
    }

    public void run() {

        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

    }

    public int[] getSortedArray() {
        return array;
    }
}
