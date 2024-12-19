package lesson_7_oop_princinples_homework.apple;

public class Apple {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    public String getColorApple() {
        return color;
    }

    public void changeColorApple(String newColor) {
        this.color = newColor;
    }
}
