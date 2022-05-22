package com.company;

public class Main {

    public static void main(String[] args) {
        var a = new Animal();
        var c = new Cat();
        var d = new Dog();

        a.eat();

        c.eat();
        c.meow();

        d.eat();
        d.bark();

        Animal an = new Pinguen();
        an.eat();
    }
}
