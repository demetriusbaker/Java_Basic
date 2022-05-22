package Interfaces;

public class Animal implements Info{
    private int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    public void Show_Info(){
        System.out.println("Id: " + id);
    }
}
