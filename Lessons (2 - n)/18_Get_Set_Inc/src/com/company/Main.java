package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        var p = new Pivas();
        p.SetNameAndVolume("Жигулевское", 0.5f);
        p.GetNameAndVolume();

        var p1 = new Pivas();
        p1.SetNameAndVolume("", -5);
        p1.GetNameAndVolume();
    }
}

class Pivas{
    private String name_beer;
    private float volume;

    public void SetNameAndVolume(String n, float v){
        if (n.isEmpty() || v <= 0){
            n = "Бобров";
            v = 0.25f;
        }
        name_beer = n;
        volume = v;
    }

    public void GetNameAndVolume(){
        System.out.printf("Beer: %s\nVolume: %.2f liters\n", name_beer, volume);
    }
}
