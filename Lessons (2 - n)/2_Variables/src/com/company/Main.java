package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // byte - short - int - long
        int intValue;
        intValue = 12;
        System.out.println(intValue);

        double doubleValue;
        doubleValue = 3.1415;
        float floatValue = 1.25f;
        System.out.println(doubleValue + " " + floatValue);

        boolean[] boolean_array = {false, true};
        for (int i = 0; i < boolean_array.length; i++){
            for (int j = 0; j < boolean_array.length; j++){
                System.out.println(boolean_array[i] && !boolean_array[j] || !boolean_array[i] && boolean_array[j]);
                System.out.printf("%b \n\n", boolean_array[i] ^ boolean_array[j]);
            }
        }
    }
}
