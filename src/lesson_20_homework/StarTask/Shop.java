package lesson_20_homework.StarTask;

public class Shop {

    public static final int AMOUNT_PRODUCT_MANUFACT = 5;
    private static final int MAX_PRODUCTS = 3;
    private int productCount = 0;
    private final Object lock = new Object();

    public void produce() throws InterruptedException {
        synchronized (lock) {
            while (productCount >= MAX_PRODUCTS) {
                System.out.println("Shop is empty...");
                lock.wait();
            }
            productCount++;
            System.out.println("manufacture product ");
            lock.notifyAll();
        }
    }

    public void buy() throws InterruptedException {
        synchronized (lock) {
            while (productCount <= 0) {
                System.out.println("Shop doesn't have products...");
                lock.wait();
            }
            productCount--;
            System.out.println("buy product ");
            lock.notifyAll();
        }
    }

}
