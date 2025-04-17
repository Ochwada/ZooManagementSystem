package com.example.zooManagementSystem;

public class Parrot extends Animal {

    // Constructor
    public Parrot(String name, int age) {
        super(name, age, "Bird");
    }


    @Override
    public void makeSound() {
        System.out.println("Squawk! I'm a Parrot!");
    }
}