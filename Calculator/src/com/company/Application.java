package com.company;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;

    public Application(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void start() {
        run();
    }

    private void run() {
        while (true) {
            Operation operation = counting();
            if (operation == null) {
                break;
            }
            operation.calculate(a, b);
        }
    }

    private Operation counting() {
        showMenu();
        String symbol = scanner.nextLine();
        switch (symbol) {
            case "+":
                return new Addition();
            case "-":
                return new Subtraction();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            case "0":
                return null;
            default:
                System.out.println("Нет такой операции!!! Повторите ввод!");
                return counting();
        }
    }

    private void showMenu() {
        System.out.println("Выберите операцию: ");
        System.out.println("+ - сложение");
        System.out.println("- - вычитание");
        System.out.println("* - умножение");
        System.out.println("/ - деление");
        System.out.println("0 - выход");
    }
}
