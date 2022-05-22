package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("1) ArrayList");
        System.out.println("2) LinkedList versus ArrayList");
        System.out.println("3) Queue");
        System.out.println("4) Deque");
        System.out.println("5) Simple queue");
        System.out.println("6) Simple stack");
        System.out.println("7) Set");
        switch (scanner.next()){
            case "1" -> {
                System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
                System.out.println("ArrayList:");
                ArrayListClass.show();
                System.out.println("#######################");
            }
            case "2" -> {
                System.out.println("LinkedList versus ArrayList:");
                LvsAClass.show();
                System.out.println("#######################");
            }
            case "3" -> {
                System.out.println("Queue:");
                QueueClass.show();
                System.out.println("#######################");
            }
            case "4" -> {
                System.out.println("Deque:");
                DequeClass.show();
                System.out.println("#######################");
            }
            case "5" -> {
                System.out.println("Simple queue:");
                SimpleQueue.show();
                System.out.println("#######################");
            }
            case "6" -> {
                System.out.println("Simple stack:");
                SimpleStack.show();
                System.out.println("#######################");
            }
            case "7" -> {
                System.out.println("Set:");
                SetClass.show();
                System.out.println("#######################");
            }
            default -> System.out.println("Incorrect input!");
        }
    }
}