class StackException extends Exception {
    StackException(String m) {
        super(m);
    }
}

class Stack {
    int[] data;
    int ptr = -1;
    static int size = 5;

    Stack() {
        data = new int[size];
    }

    Stack(int s) {
        data = new int[s];
    }

    boolean isFull() {
        return ptr == data.length - 1;
    }

    boolean isEmpty() {
        return ptr == -1;
    }

    boolean push(int e) {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        ptr++;
        data[ptr] = e;
        return true;
    }

    int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr--];
    }

    int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr];
    }
}

public class CustomDynamicStack {
    public static void main(String[] args) throws StackException {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(10);
        System.out.println(stack.peek());

    }
}
