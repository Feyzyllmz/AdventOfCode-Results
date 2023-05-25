import java.util.EmptyStackException;

public class Stack {
    private int maxSize;
    private int top;
    private String[] stackArray;

    public Stack(int size) {
        maxSize = size;
        top = -1;
        stackArray = new String[maxSize];
    }

    public void push(String value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public int size(){
        int size = 0;
        while (!isEmpty()){
            pop();
            size++;
        }
        return size;
    }

    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}