package lesson_20_homework.StarTask;

public class Buyer implements Runnable {

    private final Shop shop;

    public Buyer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            for (int j = 1; j <= Shop.AMOUNT_PRODUCT_MANUFACT; j++) {
                shop.buy();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
