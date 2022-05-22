package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
	// write your code here
        int a = 5, b = 3, c = 4, d = 8;
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        double x = 13.35, y = 6.4323;

        System.out.println(Sum(a, b));
        System.out.println(Sum(a, b, c));
        System.out.println(Sum(a, b, c, d));
        System.out.println(Sum(array));
        System.out.println(Sum(x, y));
    }

    static int Sum(int a, int b){
        return a + b;
    }

    static int Sum(int a, int b, int c){
        return a + b + c;
    }

    static int Sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

    static int Sum(int[] array){
        return Arrays.stream(array).sum();
    }

    static double Sum(double a, double b){
        return a + b;
    }
}

