package set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetClass {
    public static void show(){
        NavigableSet<Character> treeSet = new TreeSet<>();
        treeSet.add('3');
        treeSet.add('$');
        treeSet.add(']');
        treeSet.add('[');
        treeSet.add('w');
        treeSet.add('a'); // once 'a'!
        treeSet.add('a');
        treeSet.add('a');
        treeSet.add('a');
        treeSet.add('a');
        treeSet.add('a');
        treeSet.add('b');
        treeSet.add('c');
        treeSet.add('d');
        treeSet.add('e');
        System.out.println(treeSet); // natural ordering
        System.out.println(treeSet.add('w'));
        System.out.println(treeSet.add('W'));
        System.out.println(treeSet);
        System.out.println(treeSet.ceiling('~')); // null
        System.out.println(treeSet.ceiling('+')); // '3'
        System.out.println(treeSet);

        TreeSet<Car> ts = new TreeSet();
        ts.add(new Car(123));
        ts.add(new Car(123));
        ts.add(new Car(69));
        ts.add(new Car(83));
        ts.add(new Car(68));
        ts.add(new Car(100));
        ts.add(new Car(96));
        ts.add(new Car(54));
        System.out.println(ts);

        TreeSet<Car> ts2 = (TreeSet<Car>) ts.headSet(new Car(100), true);
        System.out.println(ts2);
    }
}

class Car implements Comparable<Car>{
    private int price;

    public Car(int price){
        this.price = price;
    }

    @Override
    public int compareTo(Car car) {
        return this.price - car.price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                '}';
    }
}
