package com.company;

public class Main {

    public static void main(String[] args) {
	boolean a = 5 > 0;
	boolean b = 5 > 5;
	boolean c = 5 >= 5;
	boolean d = -3 > 0;

	System.out.printf("%b %b %b %b\n", a, b, c, d);

	int value = 10;
	while (value > 0){
        System.out.println(value--);
    }
    }
}
