package lesson_8_homework.Animals;

import java.util.Objects;
import java.util.Scanner;

public class Tiger extends  Animal {

    private final String typeEat = "meat";

    public Tiger (String familyRang, String typeName, String nickName, int age) {
        super(familyRang, typeName, nickName, age);
    }

    @Override
    public void eat() {
        System.out.print("Enter the name food to tiger? meat or other ");
        String inputLine = new Scanner(System.in).nextLine();
        if (Objects.equals(inputLine, typeEat)) {
            System.out.println("Tiger " + getNickName() + " likes eating meat...");
        }
        else System.out.println("Tiger " + getNickName() + " is upset...\nHe eats meat...");

    }

    @Override
    public void voice() {
        System.out.println("Voice is RRRRRRRRRRRRR");
    }

    @Override
    public String toString() {
        return "TIGER\n" + super.toString();
    }
}
