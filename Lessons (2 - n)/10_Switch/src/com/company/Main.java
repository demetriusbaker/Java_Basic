package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            int key = in.nextInt();
            switch (key){
                case 1:
                    System.out.println("1: " + key);
                    break;
                case 2:
                    System.out.println("2: " + key);
                    break;
                case 3:
                    System.out.println("3: " + key);
                    break;
                case 4:
                    System.out.println("4: " + key);
                    break;
                case 5:
                    System.out.println("5: " + key);
                    break;
                case 10:
                case 0:
                    System.out.println("10 or 0: " + key);
                    break;
                case -1:
                    System.exit(0);
                default:
                    System.out.println("Input incorrect number!");
                    break;
            }
        }
    }
}
