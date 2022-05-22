package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayListClass {
    public static void show() throws IOException {
        ArrayList list = new ArrayList();
        list.add(3.14);
        list.add("hello");
        list.add(25);

        System.out.println(list);

        // ArrayList<Integer> aList = new ArrayList<>();
        // aList.add((Integer)list.get(1));
        // System.out.println(aList);
        // использование сырого типа недопустимо!

        ArrayList<Double> arrayList = new ArrayList();
        // double[] array = new double[10];
        arrayList.add(213.234);
        // array[0] = 213.234;
        double value = arrayList.get(0);
        // double value = array[0];
        int size = arrayList.size();
        // int size = array.length;
        arrayList.add(24.342);
        arrayList.add(356.13);
        arrayList.add(67575.65);
        arrayList.add(1.23);
        arrayList.add(64.356);
        arrayList.add(5.0);
        arrayList.add(arrayList.size() - 1, 1234.32);
        arrayList.add(0, 3.14);

        for (var al : arrayList)
            System.out.print(al + " ");
        System.out.println();

        ArrayList<Integer> arrayList2 = new ArrayList();
        for (int i = 0; i < 100; i++){
            arrayList2.add(i + 1);
            System.out.print(arrayList2.get(i) + " ");
        }
        System.out.println();

        System.out.println("Size: " + arrayList2.size());

        int staticSize = arrayList2.size();
        for (int i = 0; i < staticSize; i++)
            arrayList2.remove(staticSize - i - 1);

        System.out.println("Size: " + arrayList2.size());

        int[] a = new int[2];
        a[0] = 123;
        System.out.println(a.length); // 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        var stringList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter [" + i + "]");
            String s = br.readLine();
            stringList.add(s);
        }

        for (var sl : stringList)
            System.out.println(sl);
        System.out.println();

        // reverse output
        for (int i = 0; i < stringList.size(); i++) {
            int currentIndex = stringList.size() - i - 1;
            System.out.println(stringList.get(currentIndex));
        }
    }
}
