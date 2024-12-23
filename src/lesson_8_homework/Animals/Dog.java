package lesson_8_homework.Animals;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Dog extends Animal {

    public Dog (String familyRang, String typeName, String nickName, int age) {
        super(familyRang, typeName, nickName, age);
    }

    private final String[] typesEat = { "meat", "born", "feed" };

    @Override
    public void eat() {

        System.out.print("Enter the name food to dog? (born, meat, feed) or other ");
        String inputLine = new Scanner(System.in).nextLine();

        for (String type : typesEat) {
            if (Objects.equals(type, inputLine)) {
                System.out.println("Dog " + getNickName() + " likes eating " + type + "...");

            }
        }

        if (!Arrays.asList(typesEat).contains(inputLine)) {
            System.out.println("Dog " + getNickName() + " is upset...\nHe eats meat, born of feed...");
        }
    }

    @Override
    public void voice() {
        System.out.println("Voice is WOF-WOF-WOF");
    }


    @Override
    public String toString() {
        return "DOG\n" + super.toString();
    }
}
