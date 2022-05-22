package com.company;

import java.util.HashMap;
import java.util.Map;

public class SimpleMap {
    public static void output(){
        Map<String, Integer> map = new HashMap<>();
        map.put("beer", 12343);
        map.put("tool", 324);
        map.put("note", 23421);
        map.put(null, 0);

        System.out.println("Size: " + map.size());
        System.out.println(map);

        for (Map.Entry<String, Integer> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        System.out.println();

        // при дублировании ключа, старое значение стирается
        map.put("beer", 999);

        for (Map.Entry<String, Integer> m : map.entrySet())
            System.out.println(m.getKey() + " " + m.getValue());
        System.out.println();
    }
}