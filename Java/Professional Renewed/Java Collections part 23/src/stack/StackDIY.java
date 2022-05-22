package stack;

public class StackDIY<T> {
    private final T[] stackArray;
    private int top;

    private StackDIY(int maxSize){
        this.top = -1;
        this.stackArray = (T[]) new Object[maxSize];
    }

    private void push(T element){
        stackArray[++top] = element;
    }

    private T pop(){
        return stackArray[top--];
    }

    private T peak(){
        return stackArray[top];
    }

    private boolean isEmpty(){
        return top == -1;
    }

    public static void show(){
        StackDIY stack = new StackDIY(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.pop());
        System.out.println(stack.peak());
        System.out.println(stack.isEmpty());

        while (!stack.isEmpty())
            System.out.println(stack.pop());

        var stackSTR = new StackDIY<String>(3);
        stackSTR.push("cool!");
        stackSTR.push("is");
        stackSTR.push("Dima");

        while (!stackSTR.isEmpty())
            System.out.println(stackSTR.pop());

        var differentStack = new StackDIY(8);
        differentStack.push(true);
        differentStack.push('#');
        differentStack.push(2);
        differentStack.push(3.14);
        differentStack.push("Message!!! STRING!");
        differentStack.push(new int[]{1,34,6,47,4});

        while (!differentStack.isEmpty())
            System.out.println(differentStack.pop());
    }
}
