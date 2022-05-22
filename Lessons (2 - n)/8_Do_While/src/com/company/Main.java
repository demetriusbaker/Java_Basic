package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var in = new Scanner(System.in);

        int value = in.nextInt();
        do{
            System.out.println(value--);
        }while(value > 0);
    }
}

