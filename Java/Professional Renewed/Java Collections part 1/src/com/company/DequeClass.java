package com.company;

import java.util.ArrayDeque;

public class DequeClass {
    public static void show(){
        ArrayDeque<String> states = new ArrayDeque<>();
        states.add("United Kingdom");
        states.add("United States");

        System.out.println(states);

        states.push("Ukraine");

        System.out.println(states.getFirst());
        System.out.println(states.getLast());

        /*
        for (var s : states)
            System.out.println(states.pop());
         */

        while (states.peek() != null)
            System.out.println(states.pop());

        System.out.println(states); // []
    }
}
