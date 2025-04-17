package com.example.zooManagementSystem;

public class Lion extends Animal {

    // Constructor: Sets type to "Mammal"
    public Lion(String name, int age) {
        super(name, age, "Mammal");
    }

    // Override makeSound(): "Roar! I'm a Lion!"
    @Override
    public void makeSound() {
        System.out.println("Roar! I'm a Lion!");
    }
}