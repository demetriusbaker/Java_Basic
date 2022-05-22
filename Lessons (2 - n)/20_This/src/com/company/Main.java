package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Human man = new Human();
        man.Set("Dima", 18);
        man.Get();
        System.out.println();
        Human man1 = new Human();
        man1.Set("", -120);
        man1.Get();
    }
}

class Human{
    String name;
    int age;

    void Set(String name, int age){
        if (name.isEmpty() || age <= 0){
            name = "Vasya";
            age = 23;
        }
        this.name = name;
        this.age = age;
    }

    void Get(){
        System.out.printf("Name: %s and Age: %d", name, age);
    }
}