class StackException extends Exception {
    StackException(String msg) {
        super(msg);
    }
}

class Stack {
    static int[] data;
    static int ptr = -1;
    static final int size = 10;

    Stack() {
        data = new int[size];
    }

    Stack(int s) {
        data = new int[s];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int d) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is Full");
        }
        ptr++;
        data[ptr] = d;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Full");
        }
        return data[ptr];
    }
}

public class CustomStack {

    public static void main(String[] args) throws StackException {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.peek());
        stack.push(5);
        System.out.println(stack.isEmpty());
        System.out.println(stack.isFull());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}