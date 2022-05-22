package mapClasses;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class SimpleWeakHashMap {
    public static void show(){
        // strong reference
        Integer test = 1;
        // soft reference
        SoftReference<Integer> softReference = new SoftReference<>(test);
        test = null;
        // weak reference
        Integer test2 = 2;
        WeakReference<Integer> weakReference = new WeakReference<>(test2);
        test2 = null;
        // phantom reference
        Integer test3 = 3;
        PhantomReference<Integer> phantomReference = new PhantomReference<>(test3, new ReferenceQueue<>());
        //

        Map<String, String> weakHashMap = new WeakHashMap<>();
        Map<String, String> hashMap = new HashMap<>();

        String keyWeakHashMap = new String("keyWeakHashMap");
        String keyHashMap = new String("keyHashMap");

        weakHashMap.put(keyWeakHashMap, "weakHash");
        hashMap.put(keyHashMap, "hash");

        System.out.println("Before gc " + weakHashMap.get("keyWeakHashMap") + " " + hashMap.get("keyHashMap"));

        keyWeakHashMap = null;
        keyHashMap = null;

        System.gc();

        System.out.println("After gc " + weakHashMap.get("keyWeakHashMap") + " " + hashMap.get("keyHashMap"));
    }
}
