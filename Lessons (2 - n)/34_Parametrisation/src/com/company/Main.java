package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /// Java 5 /////////////////////////

        List product = new ArrayList();
        product.add("Milk");
        product.add("Eggs");
        product.add("Beer");
        product.add("Bread");
        product.add("Banana");
        product.add("Water");
        product.add("Cookie");

        // Downcasting! from obj to String
        String drink = (String)product.get(5);
        System.out.println("Drink: " + drink);

        /// Generics /////////////////////////

        List<String> product1 = new ArrayList<String>();
        product1.add("Apple");
        product1.add("Banana");
        product1.add("Kiwi");
        product1.add("Grants");

        System.out.println("Bird: " + product1.get(2));

        /// Java 7 /////////////////////////

        List<String> product2 = new ArrayList<>();
        product2.add("Apple");
        product2.add("Banana");
        product2.add("Kiwi");
        product2.add("Grants");

        System.out.println(product2.get(0) + "+Pen");
    }
}
