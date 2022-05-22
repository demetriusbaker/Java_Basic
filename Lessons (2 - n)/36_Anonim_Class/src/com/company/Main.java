package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal a = new Animal();
        a.Eat();

        OtherAnimal oa = new OtherAnimal();
        oa.Eat();

        // Тсс, здесь затаился анонимный класс!
        Animal a1 = new Animal(){
            public void Eat(){
                System.out.println("Anonymous is eating!");
            }
        };
        // создан объект анонимного класса, наследованного от Animal
        a1.Eat();

        // мораль всей басни: если надо 1 раз переопределить метод
        // лучше использовать анонимный класс!

        // также и для интерфейса

        AbleToEat ableToEat = () ->
                System.out.println("Anonymous interface also is eating!");

        ableToEat.Eat();
    }
}

class Animal{
    public void Eat(){
        System.out.println("Animal is eating!");
    }
}

class OtherAnimal extends Animal{
    public void Eat(){
        System.out.println("Other animal is eating!");
    }
}

interface AbleToEat{
    public void Eat();
}