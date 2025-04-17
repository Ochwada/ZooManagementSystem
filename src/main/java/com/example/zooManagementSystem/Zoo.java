package com.example.zooManagementSystem;

import java.util.ArrayList;
import java.util.List;

/****************************************************
 * Zoo.java
 * Author: Ochwada, Anika, Ornella
 * Date: Thursday, 17.Apr.2025, 14:53 hrs
 * Description:
 * Objective:
 ***************************************************/

public class Zoo {
    private final List<Animal> animalsList = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animalsList.add(animal);
    }

    public void showAllAnimal() {
        for (Animal animal : animalsList) {
            System.out.println(animal.getName() + "is a " + animal.getType());
        }
    }

    public void simulateAnimalSounds() {
        System.out.println("\nAnimal Sounds:");
        for (Animal animal : animalsList) {
            animal.makeSound();
        }
    }

}
