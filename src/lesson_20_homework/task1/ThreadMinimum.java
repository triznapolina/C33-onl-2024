package lesson_20_homework.task1;

public class ThreadMinimum extends Thread {

    private int[] array;
    private int min;

    public ThreadMinimum(int[] array){
        this.array = array;
    }


    @Override
    public void run(){

        min = array[0];

        for (int number : array) {
            if (number < min) {
                min = number;
            }
        }

    }

    public int getMin() {
        return min;
    }
}
