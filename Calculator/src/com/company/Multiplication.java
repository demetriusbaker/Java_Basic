package com.company;

public class Multiplication implements Operation {

    @Override
    public void calculate(int a, int b) {
        int res = a * b;
        System.out.println("Произведение двух чисел равно: " + res);
    }
}
