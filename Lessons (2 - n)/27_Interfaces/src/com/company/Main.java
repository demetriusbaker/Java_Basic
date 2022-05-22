package com.company;

import Interfaces.*;

public class Main {
    public static void Output_Info(Info info){
        info.Show_Info();
    }

    public static void main(String[] args) {
	// write your code here
        Animal a = new Animal(312456);
        a.sleep();
        Output_Info(a);

        Person p = new Person("Person");
        p.SayHello();
        Output_Info(p);

        Info info1 = new Animal(134);
        Output_Info(info1);

        Info info2 = new Person("Eboy");
        Output_Info(info2);
    }
}
