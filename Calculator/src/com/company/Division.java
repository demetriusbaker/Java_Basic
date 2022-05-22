package com.company;

public class Division implements Operation {

    @Override
    public void calculate(int a, int b) {
        int res = a / b;
        System.out.println("Частное двух чисел равно: " + res);
    }
}
