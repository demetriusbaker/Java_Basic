package com.company;

public class Main {

    public static void main(String[] args) {
        // Double, Float, Long, Integer, Short, Byte, Character and Boolean
        Integer x = new Integer(123);
        int a = Integer.parseInt("1234");

        System.out.println(x);
        System.out.println(a);

        // упаковка и распаковка

        int x1 = 1;
        Integer x2 = x1;
        int x3 = x2;

        System.out.println(x2);
        System.out.println(x3);
    }
}
