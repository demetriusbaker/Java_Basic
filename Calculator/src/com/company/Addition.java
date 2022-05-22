package com.company;

public class Addition implements Operation {

    @Override
    public void calculate(int a, int b) {
        int res = a + b;
        System.out.println("Сумма двух чисел равна: " + res);
    }
}
