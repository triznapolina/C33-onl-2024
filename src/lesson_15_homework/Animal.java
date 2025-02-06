package lesson_15_homework;

import java.util.ArrayList;
import java.util.List;

// Task 2. Create a class that will store a collection of animal names.
//Implement methods for deleting and adding animals according to the following rules:
//it is always added to the beginning of the collection, and it is always deleted from the end. Show the operation
//of an object of this class in the main method of another class.
public class Animal {

    private List<String> animals;

    public Animal(){
        this.animals = new ArrayList<>();
    }

    public void addAnimal(String animal) {
        animals.add(0, animal); // Добавляем в начало списка
    }

    public void deleteAnimal() {
        try {
            animals.remove(animals.size() - 1);
        }
        catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }

    public void displayAnimals() {
        if (animals.isEmpty()) {
            System.out.println("No animals in the collection."); // Если коллекция пуста
        } else {
            System.out.println("Animal's collection: " + animals); // Выводим текущий список
        }
    }


}
