package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        if (5 == 2 + 3)
            System.out.println("5 == 5");

        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();

        if(a > 100){
            System.out.println("a > 100");
            if (a >= 1000)
                System.out.println("a => 1000");
        }
        else if (a >= 10 && a <= 100)
            System.out.println("a => 10 and a <= 100");
        else
            System.out.println("a < 10");

        boolean vitalur = in.nextBoolean(), sosedi = in.nextBoolean();

        if (vitalur ^ sosedi)
            System.out.println("Я пошёл в магазиг за хлебом :-)");
        else
            System.out.println("Я остался в общаге");
    }
}
