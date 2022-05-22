package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите первое число: ");
                int a = scanner.nextInt();
                System.out.print("Введите второе число: ");
                int b = scanner.nextInt();

                Application application = new Application(a, b);
                application.start();
            } catch (Exception e) {
                break;
            }
        }
    }
}
