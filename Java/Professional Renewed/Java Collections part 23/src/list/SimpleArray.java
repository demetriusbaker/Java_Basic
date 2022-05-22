package list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleArray {
    public static void show() throws IOException {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(0,3);
        al.add(4);
        System.out.println("Size: " + al.size());

        for (var a: al)
            System.out.println(a);
        al.clear();
        System.out.println("Size: " + al.size());

        for (int i = 1; i <= 25; i++){
            al.add(i);
            System.out.print(al.get(i - 1) + " ");
        }
        System.out.println();
        System.out.println("Size: " + al.size());
        System.out.println();
        al.clear();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number [" + i + "]");
            int n = Integer.parseInt(br.readLine());
            al.add(n);
        }

        for (int i = 0; i < al.size(); i++) {
            int j = al.size() - i - 1;
            System.out.println(al.get(j));
        }
        System.out.println("Size: " + al.size());
    }
}
