package mapClasses;

import java.util.HashMap;

public class MapAnimals {
    public static void show(){
        Animals[] animals = {
                new Animals(123.432, "Labrador"),
                new Animals(213.234, "Sphinx"),
                new Animals(314.213, "Penguin")
        };

        HashMap<Animals, String> hm = new HashMap<>();
        hm.put(animals[0], "Mike");
        hm.put(animals[1], "Morsel");
        hm.put(animals[2], "Riko");
        for (var map : hm.entrySet())
            System.out.println(map.getKey() + " : " + map.getValue());

        var findName = new Animals(314.213, "Penguin");
        System.out.println(hm.get(findName));
    }
}

class Animals{
    private final double price;
    private final String breed;

    public Animals(double price, String breed) {
        this.price = price;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Price: " + price + " breed: " + breed;
    }
}