package lesson_13_homework.taskStar;

public class MainTaskFinallyBlock {

    // Task star. Write try/catch/finally, in which finally will not be called.
    public static void main(String[] args) {

        try {
            System.out.println("Start program ");

            //System output precedes the finally block, so it will not be executed.
            System.exit(0);

        } catch(Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("Something about finally block");
        }
    }

}
