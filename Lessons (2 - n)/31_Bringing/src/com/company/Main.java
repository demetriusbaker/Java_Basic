package com.company;

public class Main {

    public static void main(String[] args) {
        // primitive types: byte, short, int, long, boolean, float, double, char
        float f = 324.234f;
        float F = 324.234F;

        System.out.println(f == F);

        long l = 3462543768754366539l;
        int i = 2436536;

        long u = i; // явно
        int x = (int)l; // неявно (возможно потеря данных)

        System.out.printf("f:%f\n", f);
        System.out.printf("f:%f\n", F);
        System.out.printf("l:%d\n", l);
        System.out.printf("i:%d\n", i);
        System.out.printf("u:%d\n", u);
        System.out.printf("x:%d\n", x);

        int a = 25;
        double b = a;
        double c = 3.5;
        int d = (int)c;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        byte gandi = (byte)(-129);
        System.out.println(gandi); // 127
    }
}
