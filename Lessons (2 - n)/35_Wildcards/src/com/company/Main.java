package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> list_of_animals = new ArrayList<>();
        list_of_animals.add(new Animal(232));
        list_of_animals.add(new Animal(423));
        list_of_animals.add(new Animal(127));
        list_of_animals.add(new Animal(667));
        list_of_animals.add(new Animal(987));
        list_of_animals.add(new Animal(465));

        Print_List(list_of_animals);

        List<Dog> list_of_dogs = new ArrayList<>();
        list_of_dogs.add(new Dog());
        list_of_dogs.add(new Dog());

        Print_List(list_of_dogs);
    }

    private static void Print_List(List<?> list){
        for(var l : list)
            System.out.print(l + " ");
        System.out.println();
    }
}
