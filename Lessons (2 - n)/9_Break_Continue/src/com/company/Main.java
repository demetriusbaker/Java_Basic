package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Нечётные числа:");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                continue;
            }
            else
                System.out.println(i);
        }

        System.out.println("Прекращение после 100:");
        for (int i = 1; i > 0; i++) {
            if (i > 100) {
                break;
            }
            else
                System.out.println(i);
        }
    }
}
