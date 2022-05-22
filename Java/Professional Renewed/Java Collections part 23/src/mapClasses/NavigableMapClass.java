package mapClasses;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapClass {
    public static void show(){
        NavigableMap<String, Beer> treeMap = new TreeMap<>();
        treeMap.put("Bavarian", new Beer(1.5));
        treeMap.put("Zhigulevskoye", new Beer(2.4));
        treeMap.put("Orval", new Beer(0.5));

        System.out.println(treeMap);
        System.out.println(treeMap.get("Zhigulevskoye"));
        System.out.println(treeMap.containsKey("Bavarian"));
        System.out.println(treeMap.containsValue(new Beer(0.5)));

        Set<Map.Entry<String, Beer>> keysAndValues = treeMap.entrySet();
        System.out.println(keysAndValues);
        for (Map.Entry<String, Beer> kav : keysAndValues)
            kav.setValue(new Beer(3.14));
        System.out.println(keysAndValues);
    }
}

class Beer {
    private final double volume;

    public Beer(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return volume + "";
    }
}