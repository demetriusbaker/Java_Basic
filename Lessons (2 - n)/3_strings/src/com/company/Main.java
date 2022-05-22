package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        String s = in.nextLine(); // String - это класс! s - это название объекта!
        String space = " ", name = "Dietar";
        final int eight = 8;
        System.out.println(s + space + name + "_" + eight);
    }
}
