package Interfaces;

public class Person implements Info{
    private String name;

    public Person(String name){
        this.name = name;
    }

    public void SayHello(){
        System.out.println("Hello!");
    }

    public void Show_Info(){
        System.out.println("Name: " + name);
    }
}
