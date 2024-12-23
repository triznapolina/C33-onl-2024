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

        /*
        Animal thirdAnimal = new Dog("wolf family", "dog", "Rich", 4);
        System.out.println(thirdAnimal);
        System.out.println("-------------------------------");
        thirdAnimal.voice();
        System.out.println("-------------------------------");
        thirdAnimal.eat();
        */


        Animal forthAnimal = Dog.createNewDog("wolf family", "dog", "Rich", 4);
        System.out.println(forthAnimal);
        System.out.println("-------------------------------");
        forthAnimal.voice();
        System.out.println("-------------------------------");
        forthAnimal.eat();

        // Объяснение внесенных изменений из задачи со звездочкой:
        // Задача: Написать такой конструктор, который запретит создание объекта класса Dog в других
        //классах; Найти способ вызывать методы voice(), eat() класса Dog, который позволит
        //обойти ограничение, наложенное конструктором выше. Объяснить, как работают оба
        //способа.
        // -------
        // изменения внесены в класс Dog, создан конструктор с модификатором private, который запретит создание
        // объекта класса Dog в других классах, то есть строка
        // Animal thirdAnimal = new Dog("wolf family", "dog", "Rich", 4) вызовет ошибку;
        // Однако чтобы вызвать методы voice(), eat() класса Dog необходимо создать объект, закрытый конструктор
        // можно вызывать из открытых конструктор по средствам (this) и из статических методов внутри одного и
        // того же класса, выбрала способ создания статический метода createNewDog(), с модификатором public,
        // после его создания можно создать объект в MyMainAnimal через строку
        // Animal forthAnimal = Dog.createNewDog("wolf family", "dog", "Rich", 4);
        // Модификатор public методов voice(), eat() не изменен, таким образом их можно вызывать из класса MyMainAnimal
        // 2 способ -----
        // Если бы я выбрала способ с вызовом созданного private конструктора из public конструктора, то возможно было
        // создание объекта через public конструктор


    }

}
