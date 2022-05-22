package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var zhig = new Pivo(0.5f);
        zhig.Drink();
    }
}

class Pivo{
    private float volume;

    Pivo(float volume){
        this.volume = volume;
    }

    void Drink(){
        System.out.printf("You can drink: %f liters\n", volume);
    }
}