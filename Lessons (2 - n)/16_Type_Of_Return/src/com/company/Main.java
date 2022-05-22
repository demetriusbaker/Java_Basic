package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        // void
        Hello();
        // int
        System.out.println(Sum(2,3));
        // float
        System.out.println(Divide(3.45326f, 2.4356f));
        // boolean
        System.out.println(Ex_Or(true, false));
        // char
        System.out.println(Get_Num(3));
        // String
        System.out.println(Get_Name("Dietmar"));
    }

    static void Hello(){
        System.out.println("Hello!");
    }

    static int Sum(int a, int b){
        return a + b;
    }

    static float Divide (float a, float b){
        if (b != 0)
            return a / b;
        return b;
    }

    static boolean Ex_Or(boolean a, boolean b){
        return a ^ b;
    }

    static char Get_Num(int i){
        char[] num = {'0', '1', '2', '3', '4',
        '5', '6', '7', '8', '9'};

        if (i > 10)
            return '@';
        return num[i];
    }

    static String Get_Name(String name){
        return "Your name is " + name;
    }
}
