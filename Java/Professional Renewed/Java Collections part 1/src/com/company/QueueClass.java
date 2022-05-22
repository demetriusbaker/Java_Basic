package com.company;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {
    public static void show(){
        Queue<Integer> queue = new PriorityQueue<>(5, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        queue.offer(5);
        queue.offer(3);
        queue.offer(6);
        queue.offer(9);
        queue.offer(2);
        System.out.println(queue);
        queue.offer(4);
        queue.offer(1);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
