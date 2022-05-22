package com.company;

import java.util.stream.IntStream;

public class Solution {
    public static String whatCentury(int year) {
        int century = 10;
        while (century * 100 + 1 > year || (century + 1) * 100 < year)
            century++;

        String info = String.valueOf(++century);

        if (century % 10 == 1 && century != 11)
            info += "st";
        else if (century % 10 == 2 && century != 12)
            info += "nd";
        else if (century % 10 == 3 && century != 13)
            info += "rd";
        else
            info += "th";

        return info;
    }

    public static int summation(int n) {
        return IntStream.rangeClosed(1,n).sum();
    }
    // arr[0] = 0;
    public static int[] sumOfN(int n) {
        int[] arr = new int[Math.abs(n) + 1];
        int sign = n > 0 ? 1 : -1;

        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i - 1] + i * sign;

        return arr;
    }
}
