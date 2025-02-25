package lesson_20_homework.task1;

public class ThreadMaximum extends Thread{

    private int[] array;
    private int max;

    public ThreadMaximum(int[] array){
        this.array = array;
    }


    @Override
    public void run(){

        max = array[0];

        for (int number : array) {
            if (number > max) {
                max = number;
            }

        }
    }

    public int getMax() {
        return max;
    }
}
