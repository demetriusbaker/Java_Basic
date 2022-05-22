package com.company;

public class Main {

    public static void main(String[] args) {
        // i = i + 1   i += 1   i++
        for (int i = 0; i < 100; i++)
            System.out.println(i);

        for (int i = 100; i > 0; i--)
            System.out.println(i);

        boolean ended = false;
        for (int i = 2; !ended; i+=2){
            System.out.println(i);
            if (i >= 100) ended = true;
        }
    }
}
