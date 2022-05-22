package com.company;

public class Subtraction implements Operation {

    @Override
    public void calculate(int a, int b) {
        int res = a - b;
        System.out.println("Разность двух чисел равна: " + res);
    }
}
