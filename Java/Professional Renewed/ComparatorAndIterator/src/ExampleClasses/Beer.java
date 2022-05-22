package ExampleClasses;

public class Beer implements Comparable <Beer>{
    private String name;
    private int volume;

    public Beer(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String toString(){
        return "{Beer: " + name + " volume: " + volume + " ml}";
    }

    public int compareTo(Beer beer) {
        var name = this.name.compareTo(beer.name);
        return name != 0 ? name : this.volume - beer.volume;
    }
}
