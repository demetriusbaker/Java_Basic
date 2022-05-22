package com.company;

public class Main {

    public static void main(String[] args) {
        String[] string_array = {
                "34224fd",
                "efdght",
                "fds",
                "mlik",
                "pivo"
        };

        for (String s: string_array
             ) {
            System.out.println(s);
        }

        int[] numbers = {1,43,54, 768, 875, 64, 53678, 59436978, 5, 3};

        for (int n: numbers
             ) {
            System.out.println(n);
        }

        int a = 2;
        String nothing = null;
        System.out.println(a);
        System.out.println(nothing);
    }
}
