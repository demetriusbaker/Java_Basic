package com.company;

public class SimpleQueue {
    private int size = 10, front, rear, count;
    private long[] queueArray;

    public SimpleQueue(int size) {
        this.size = size;
        this.front = this.rear = this.count = 0;
        this.queueArray = new long[size];
    }

    public void insert(long value) {
        if (rear == size - 1) rear = 0;
        queueArray[rear++] = value;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public long remove() {
        long buffer = queueArray[front++];
        if (front == size) front = 0;
        count--;
        return buffer;
    }

    public static void show(){
        SimpleQueue simpleQueue = new SimpleQueue(10);
        simpleQueue.insert(1235246);
        simpleQueue.insert(546578);
        simpleQueue.insert(992340);
        simpleQueue.insert(100003232);
        simpleQueue.insert(45764);
        simpleQueue.insert(653789);
        simpleQueue.insert(8765);

        while (!simpleQueue.isEmpty())
            System.out.println(simpleQueue.remove());
    }
}
