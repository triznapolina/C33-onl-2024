package lesson_8_homework.Animals;

import java.util.Scanner;

public class Rabbit extends Animal{

    private final String typeEat = "grass";

    public Rabbit (String familyRang, String typeName, String nickName, int age) {
        super(familyRang, typeName, nickName, age);
    }

    @Override
    public void eat() {
        System.out.print("Enter the name food to rabbit? grass or other ");
        String inputLine = new Scanner(System.in).nextLine();
        if (typeEat.equals(inputLine)) {
            System.out.println("Rabbit " + getNickName() + " likes eating grass...");
        }
        else System.out.println("Rabbit " + getNickName() + " is upset...\nHe eats grass...");

    }

    @Override
    public void voice() {
        System.out.println("Voice is UI-UI-UI");
    }

    @Override
    public String toString() {
        return "RABBIT\n" + super.toString();
    }


}



