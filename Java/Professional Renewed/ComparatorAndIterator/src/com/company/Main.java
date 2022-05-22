package com.company;

import ExampleClasses.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SimpleCollection.show();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Animal[] animals = {
                new Animal("Sphynx", 400.0),
                new Animal("Malamute", 233.32),
                new Animal("Crow", 324.32)
        };

        for (var a: animals)
            System.out.println(a);

        System.out.println(animals);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        IteratorClass.show();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SimpleMap.output();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SimpleComparable.show();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        SimpleComparator.show();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
