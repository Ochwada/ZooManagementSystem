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

    /// --------------------Method:  Add  Animals in the List
    public void addAnimal(Animal animal) {
        animalsList.add(animal);
    }

    /// --------------------Method:  Show all Animals in the List
    public void showAllAnimal() {
        for (Animal animal : animalsList) {
            System.out.println(animal.getName() + "is a " + animal.getType());
        }
    }

<<<<<<< HEAD
    /// --------------------  Method:  Feed Animals
    public void feedAllAnimals(Animal animal){
        System.out.println("Feeding " + animal.getName() + " some food ... ");
    }


=======
    public void simulateAnimalSounds() {
        System.out.println("\nAnimal Sounds:");
        for (Animal animal : animalsList) {
            animal.makeSound();
        }
    }

>>>>>>> d9d0a4a6d079b546aa439b9536f696a88eabaf5c
}
