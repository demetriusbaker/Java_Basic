package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word = new String("Привет");
        Scanner in = new Scanner(System.in);
        // Class object_name = new constuctor_of_Class(parameter/s);

        System.out.print("Enter your name: ");
        String name = in.next();

        System.out.printf("%s %s!\n", word, name);
    }
}
