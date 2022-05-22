package mapClasses;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

public class SimpleIdentityHashMap {
    public static void show(){
        System.out.println("IdentityHashMap");

        IdentityHashMap<Integer, String> identityHashMap = new IdentityHashMap<>();

        identityHashMap.put(new Integer(21), "Twenty one pilots");
        identityHashMap.put(new Integer(6), "Six");
        identityHashMap.put(new Integer(5), "Five");
        identityHashMap.put(new Integer(7), "Seven");
        identityHashMap.put(new Integer(6), "Sex");

        // сравнение значений по ссылкам ==, но не методом equals() !!!

        Set set = identityHashMap.entrySet();

        for (Object o: set){
            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)o;
            System.out.println(map.getKey() + " " + map.getValue());
        }

        System.out.println("HashMap");

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(new Integer(21), "Twenty one pilots");
        hashMap.put(new Integer(6), "Six");
        hashMap.put(new Integer(5), "Five");
        hashMap.put(new Integer(7), "Seven");
        hashMap.put(new Integer(6), "Sex");

        for (Object o: hashMap.entrySet()){
            Map.Entry<Integer, String> map = (Map.Entry<Integer, String>)o;
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }
}
