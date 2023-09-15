package ru.mirea.lab2.task5;

import java.util.ArrayList;
import java.util.List;

public class DogShelter {
    private List<Dog> dogs;

    public DogShelter() {
        dogs = new ArrayList<>();
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogs;
    }

    public static void main(String[] args) {
        DogShelter shelter = new DogShelter();

        Dog dog1 = new Dog("Rex", 3);
        Dog dog2 = new Dog("Bella", 2);

        shelter.addDog(dog1);
        shelter.addDog(dog2);

        List<Dog> dogs = shelter.getAllDogs();
        for (Dog dog : dogs) {
            System.out.println(dog.toString());
            System.out.println("Human age: " + dog.humanAge() + " years");
        }
    }
}
