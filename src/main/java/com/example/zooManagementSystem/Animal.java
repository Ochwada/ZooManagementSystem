package com.example.zooManagementSystem;

/****************************************************
 * Animal.java
 * Author: Ochwada, Anika, Ornella
 * Date: Thursday, 17.Apr.2025, 14:30 hrs
 * Description:
 * Objective:
 ***************************************************/

public class Animal {

    /// --------------------  Encapsulation
    private String name;
    private int age;
    private String type;

    /// --------------------  Constructors
    // No-Arg.
    public Animal(){
    }
    // Parameterised
    public  Animal(String name, int age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }
    /// --------------------  Methods (is polymorphic ?)

    public void makeSound(String sound){
        System.out.println("It`s Sounds like: " + sound );
    }


    /// --------------------  Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    /// --------------------  Setter
    public void setAge(int age) {
        //this.age = age;
        if(age  > 0){
            this.age = age;
        }else {
            System.out.println("Add a valid Age");
        }
    }
}
