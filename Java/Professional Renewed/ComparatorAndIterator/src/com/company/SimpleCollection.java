package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class SimpleCollection{
    public static void show(){
        Collection<Integer> collection = new ArrayList<>();
        System.out.println("Size: " + collection.size());
        collection.add(3);
        collection.add(5);
        collection.add(6);
        System.out.println(collection);
        System.out.println("Size: " + collection.size());

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(1);
        collection2.add(4);
        collection2.add(8);

        collection.addAll(collection2);
        System.out.println("Size: " + collection.size());
        System.out.println(collection);

        collection.clear();
        System.out.println("Size: " + collection.size());
        System.out.println(collection.isEmpty());

        Object[] array = collection2.toArray();

        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        for(var a: array)
            System.out.print(a + " ");
        System.out.println();
        
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        for (int a: arr)
            System.out.print(++a + " ");
        System.out.println();
    }
}
