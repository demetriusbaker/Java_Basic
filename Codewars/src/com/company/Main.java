package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Solution.whatCentury(1999));
        System.out.println(Solution.whatCentury(2011));
        System.out.println(Solution.whatCentury(2154));
        System.out.println(Solution.whatCentury(2259));
        System.out.println(Solution.whatCentury(1124));
        System.out.println(Solution.whatCentury(2000));
        System.out.println("---");
        System.out.println(Arrays.toString(Solution.sumOfN(10)));
        System.out.println(Arrays.toString(Solution.sumOfN(-10)));
        System.out.println();
    }
}