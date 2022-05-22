package com.company;

import java.util.*;

public class SetClass {
    public static void show(){
        String[] s = {
                "Пиво",
                "Хлеб",
                "Икра",
                "Молоко",
                "Чипсы",
                "Рыба",
                "Чай",
                "Чай"
        };

        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(s));

        System.out.println("HashSet");

        for (var hs : hashSet)
            System.out.println(hs + " " + hs.hashCode());

        System.out.println("LinkedHashSet");

        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(s));

        for (var lhs : linkedHashSet)
            System.out.println(lhs + " " + lhs.hashCode());

        System.out.println("TreeSet");
        
        NavigableSet<Double> treeSet = new TreeSet<>();
        treeSet.add(21.34);
        treeSet.add(64.23);
        treeSet.add(56.08);
        treeSet.add(23.12);
        treeSet.add(48.39);
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling(30.0));
        System.out.println(treeSet.floor(22.0));

        NavigableSet<Double> treeSet1 = treeSet.headSet(56.08, true);
        System.out.println(treeSet1);

        NavigableSet<Double> treeSet2 = treeSet.headSet(56.08, false);
        System.out.println(treeSet2);

        NavigableSet<Car> cars = new TreeSet<>();
        cars.add(new Car(234));
        cars.add(new Car(54));
        cars.add(new Car(546));
        cars.add(new Car(4566));
        cars.add(new Car(543));
        System.out.println(cars);

        NavigableSet<Car> cars1 = cars.headSet(new Car(543), true);
        System.out.println(cars1);
    }
}

class Car implements Comparable<Car>{
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public int compareTo(Car car) {
        return this.price - car.price;
    }

    @Override
    public String toString() {
        return "Price: " + price;
    }
}
