package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueue {
    public static void show(){
        Queue<Integer> queue = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        queue.offer(7);
        queue.offer(9);
        System.out.println(queue);
        queue.offer(10);
        queue.offer(11);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
