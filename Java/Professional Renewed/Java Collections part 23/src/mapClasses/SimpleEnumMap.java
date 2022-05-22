package mapClasses;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void show(){
        Map<Animal, String> enumMap = new EnumMap<Animal, String>(Animal.class);

        enumMap.put(Animal.CAT, "Cat");
        enumMap.put(Animal.DOG, "Dog");
        enumMap.put(Animal.BIRD, "Bird");
        enumMap.put(Animal.NULL, null);

        Set set = enumMap.entrySet();

        for (Object o: set) {
            Map.Entry m = (Map.Entry)o;
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}

enum Animal {
    CAT, DOG, BIRD, NULL
}
