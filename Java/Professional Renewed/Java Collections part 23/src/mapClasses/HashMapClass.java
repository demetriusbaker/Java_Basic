package mapClasses;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapClass {
    public static void show(){
        String[] people = {"Alex", "Dina", "George", "Katy", "Dietmar", "Jessy", "Marina"};
        HashMap<String, Human> humans = addHumansToMap(people);

        for (Map.Entry<String, Human> pair : humans.entrySet())
            System.out.println(pair.getKey() + " - " + pair.getValue());

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, 25);
        hm.put(null, 50);

        System.out.println(hm);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("laptop", "lenovo");
        linkedHashMap.put("university", "bsuir");
        linkedHashMap.put("profession", "android-developer");

        for (Map.Entry<String, String> lhm : linkedHashMap.entrySet())
            System.out.println(lhm.getKey() + " * " + lhm.getValue());
    }

    private static HashMap<String, Human> addHumansToMap(String[] people){
        HashMap<String, Human> humans = new HashMap<>();

        for (var p: people)
            humans.put(p, new Human(p));

        return humans;
    }

    private static class Human {
        private final String name;

        public Human(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

