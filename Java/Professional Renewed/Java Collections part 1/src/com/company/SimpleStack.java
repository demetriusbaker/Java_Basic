package com.company;

public class SimpleStack {
    private int size, top;
    private long[] stackArray;

    public SimpleStack(int size) {
        this.size = size;
        this.stackArray = new long[size];
        this.top = -1;
    }

    public void push(long value) {
        stackArray[++top] = value;
    }

    public long pop() {
        if (top == -1) return 0;
        return stackArray[top--]; // with delete POP
    }

    public long peek() {
        return stackArray[top]; // without delete PEEK
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void show(){
        SimpleStack simpleStack = new SimpleStack(16);
        simpleStack.push(123);
        simpleStack.push(456);
        simpleStack.push(789);
        simpleStack.push(147);
        simpleStack.push(258);
        simpleStack.push(369);
        simpleStack.push(666);

        System.out.println(simpleStack.pop()); // 666
        System.out.println(simpleStack.peek()); // 369
        System.out.println(simpleStack.peek()); // 369
        System.out.println(simpleStack.peek()); // 369

        System.out.println("---");
        while (!simpleStack.isEmpty())
            System.out.println(simpleStack.pop());
        System.out.println("---");
        /*
        ---
        369
        258
        147
        789
        456
        123
        ---
         */
        System.out.println(simpleStack.pop()); // 0
    }
}
