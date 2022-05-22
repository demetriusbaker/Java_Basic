package com.company;

import ExampleClasses.Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClass {
    public static void show() {
        ArrayList al = new ArrayList();
        al.add(23);
        al.add(34);
        al.add(62);
        al.add(89);
        al.add(10);

        System.out.println(al);

        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            var tmp = iterator.next();
            System.out.print(tmp + " ");
        }

        System.out.println();

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal("Kitty", 1000.35));
        animalArrayList.add(new Animal("Garry", 1506.34));

        Iterator<Animal> iter = animalArrayList.iterator();
        while (iter.hasNext()){
            Animal tmp = iter.next();
            System.out.println(tmp);
        }
    }
}
