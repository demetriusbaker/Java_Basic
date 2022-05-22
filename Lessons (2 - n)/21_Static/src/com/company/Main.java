package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Console.WriteLine();
        Console.WriteLine("Pivo is not very good");
        Console.Write("Pivo is not very good ");
        Console c = new Console();
        c.GetA();
        Console.a = 5;
        c.GetA();
        Console c1 = new Console();
        c1.GetA();
    }
}

class Console{
    static void WriteLine(String s){
        System.out.println(s);
    }
    static void WriteLine(){
        System.out.println();
    }

    static void Write(String s){
        System.out.print(s);
    }

    static int a;
    void GetA(){
        System.out.println(a);
    }
}
