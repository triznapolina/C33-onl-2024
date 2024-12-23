package lesson_8_homework.Animals;

public class MyMainAnimal {

    public static void main(String[] args) {

        Animal animal = new Rabbit("hare family", "rabbit", "Bantick", 2);
        System.out.println(animal);
        System.out.println("-------------------------------");
        animal.voice();
        System.out.println("-------------------------------");
        animal.eat();
        System.out.println("-------------------------------\n");

        Animal secondAnimal = new Tiger("feline family", "tiger", "Bob", 6);
        System.out.println(secondAnimal);
        System.out.println("-------------------------------");
        secondAnimal.voice();
        System.out.println("-------------------------------");
        secondAnimal.eat();
        System.out.println("-------------------------------\n");

        Animal thirdAnimal = new Dog("wolf family", "dog", "Rich", 4);
        System.out.println(thirdAnimal);
        System.out.println("-------------------------------");
        thirdAnimal.voice();
        System.out.println("-------------------------------");
        thirdAnimal.eat();


    }



}
