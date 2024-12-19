package lesson_7_oop_princinples_homework.apple;


public class MyMain {

    // Task *. Создать класс Apple и добавить в него поле color с модификатором доступа private и
    // инициализировать его. В методе main другого класса создать объект Apple, и не
    // используя, изменить значение поля color
    public static void main(String[] args) {
        Apple firstApple = new Apple("red");
        System.out.println("Initial color: " + firstApple.getColorApple());

        firstApple.changeColorApple("green");
        System.out.println("Modified color: " + firstApple.getColorApple());
    }
}
