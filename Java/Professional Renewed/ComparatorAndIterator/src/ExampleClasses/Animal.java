package ExampleClasses;

public class Animal {
    private String breed;
    private double price;

    public Animal(String breed, double price){
        this.breed = breed;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Breed: " + breed +
                " price: " + price;
    }
}
