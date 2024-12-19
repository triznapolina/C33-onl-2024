package lesson_7_oop_princinples_homework.apple;

public class MyMain {

    public static void main(String[] args) {
        Apple firstApple = new Apple("red");
        System.out.println("Initial color: " + firstApple.getColorApple());

        firstApple.changeColorApple("green");
        System.out.println("Modified color: " + firstApple.getColorApple());
    }
}
