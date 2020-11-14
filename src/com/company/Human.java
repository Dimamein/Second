package com.company;

public class Human {
    String name;
    int age;
    int height;

    public void Speak() {

        if (name != null) {
            System.out.print("Hello my name is " + name);
        }
        if (age > 0) {
            System.out.print(" I am " + age + " years old ");
        }
        if (height > 0) {
            System.out.print("I am " + height + " centimeters tall");
        }
        System.out.println();
        
    }

    public Human() {
        System.out.println("Create a default Human!");
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


}
