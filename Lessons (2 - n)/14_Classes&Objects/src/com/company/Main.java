package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = new Person();
        p.open_field = 100;
        p.Get_Info();

        Person p1 = new Person("Dietmar", 13);
        p1.open_field = 10;
        p1.Get_Info();
    }
}

class Person {
    // открытое поле
    int open_field;

    // закрытые поля
    private String name;
    private int age;

    // конструкторы
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){
        this.name = "Дима";
        this.age = 18;
    }

    // метод
    public void Get_Info(){
        System.out.printf("Name: %s, age: %d\n", name, age);
        System.out.printf("Value of open field: %s\n", open_field);
    }
}