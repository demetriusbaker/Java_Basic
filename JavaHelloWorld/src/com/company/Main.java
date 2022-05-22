package com.company;

import java.util.Scanner;

public class Main {

    public static int Sum(int a, int b){
        return a + b;
    }

    public static <string> void main(String[] args)
    {
	    for (int i = 0; i < 10; i++)
        System.out.println("Hello world!");

	    int a = 4;
	    int b = 5;

	    System.out.println(a + b);

        Scanner in = new Scanner(System.in);

        System.out.println(in.nextInt() == 90 ? + 100 + "%" : 0);

        char c = 'c';
        System.out.println(c + " good");

        String[] drink = {"beer", "wine"};
        System.out.println("The best drink is" + drink[0]);
        System.out.printf("The best drink also is %s", drink[1]);
        System.out.printf("The sum of 2 and 3 is: %d\n", Sum(2,3));

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int)(Math.random() * 100) + 1; // [1, 100]
            System.out.println(array[i]);
        }
    }
}

