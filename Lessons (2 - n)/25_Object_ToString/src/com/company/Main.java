package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String string = "String";
        System.out.println(string);
        Human h = new Human("bitch");
        System.out.println(h);
        /*
        Usually: Human@1134affc
        with public String toString(): bitch
         */
    }
}

class Human{
    private String s;

    Human(String s){
        this.s = s;
    }

    public String toString(){
        return s;
    }
}