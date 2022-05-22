package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal a = new Animal();
        a.Eat();
        a.Sleep();

        Dog d = new Dog();
        d.Eat();
        d.Sleep();
        d.Bark();
        d.Show_Name();
    }
}
