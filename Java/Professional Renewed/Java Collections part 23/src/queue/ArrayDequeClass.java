package queue;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void show(){
        ArrayDeque<String> states = new ArrayDeque();
        states.add("Ukraine");
        states.add("United Kingdom");
        states.add("USSR");
        states.add("USA");
        states.add("Uganda");
        System.out.println("Size: " + states.size());

        System.out.println(states);
        System.out.println("First: " + states.getFirst());
        System.out.println("Last: " + states.getLast());
        System.out.println("Size: " + states.size());

        while (states.peek() != null)
            System.out.println(states.pop());
        System.out.println("Size: " + states.size());
        
        ArrayDeque<Person> people = new ArrayDeque<>();
        people.addFirst(new Person("Dima"));
        people.addLast(new Person("Alex"));
        people.add(new Person("Roma"));

        for (var p : people)
            System.out.println(p);
    }
}
