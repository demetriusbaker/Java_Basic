package com.company;

public class Main {

    public static void main(String[] args) {
        // Upcasting
        // from dog to animal
        Animal a = new Dog();

        Dog d = new Dog();
        Animal a1 = d;

        // Downcasting
        // from animal to dog
        Dog dog = (Dog) a;
        dog.bark();

        /*
        Animal animal = new Animal();
        Dog dog1 = (Dog) animal;
        dog1.bark();
         */
    }
}