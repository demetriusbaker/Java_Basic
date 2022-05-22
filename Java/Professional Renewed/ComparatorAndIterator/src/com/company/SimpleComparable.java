package com.company;

import ExampleClasses.Beer;

import java.util.Arrays;

public class SimpleComparable{
    public static void show(){
        Beer[] beers = {
                new Beer("Жигулевское", 500),
                new Beer("Жигулевское", 1500),
                new Beer("Баварское", 1000),
                new Beer("Баварское", 500),
                new Beer("Балтика", 2000),
                new Beer("Балтика", 1000)
        };

        for (var b : beers)
            System.out.println(b);
        System.out.println("-----");

        Arrays.sort(beers);

        for (var b : beers)
            System.out.println(b);
        System.out.println("-----");
    }
}
