package queue;

public class QueueDIY<T> {
    private final T[] queueArray;
    private int front;
    private int rear;
    private int nItem;
    private final int maxSize;

    private QueueDIY(int maxSize){
        this.maxSize = maxSize;
        this.queueArray = (T[]) new Object[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItem = 0;
    }

    private void insert(T element){
        if (rear == maxSize - 1)
            rear = -1;
        queueArray[++rear] = element;
        nItem++;
    }

    private boolean isEmpty(){
        return nItem == 0;
    }

    private T remove(){
        T value = queueArray[front++];
        if (front == maxSize)
            front = 0;
        nItem--;
        return value;
    }

    public static void show(){
        QueueDIY<Integer> queue = new QueueDIY<>(10);
        queue.insert(443210);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        queue.remove();

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
