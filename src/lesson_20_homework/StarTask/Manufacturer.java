package lesson_20_homework.StarTask;

public class Manufacturer implements Runnable{

    private final Shop shop;

    public Manufacturer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        try {
            for (int j = 0; j < Shop.AMOUNT_PRODUCT_MANUFACT; j++) {
                shop.produce();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
