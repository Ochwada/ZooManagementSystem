package com.example.zooManagementSystem;
/****************************************************
 * Elephant.java
 * Author: Ochwada, Anika, Ornella
 * Date: Thursday, 17.Apr.2025, 15:33 hrs
 * Description:
 * Objective:
 ***************************************************/
public class Elephant extends Animal {

    public Elephant(String name, int age){
        super(name, age, "Mammal");
    }

    @Override
    public void makeSound(){
        String sound = "Trumpet";
        System.out.println( sound + "! I'm an Elephant");

    }
}
