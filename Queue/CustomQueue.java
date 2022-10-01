
class Queue extends Exception {
    int[] data;
    public int end = 0;

    Queue() {
        data = new int[5];
    }

    Queue(int s) {
        data = new int[s];
    }

    boolean insert(int d) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is Full!");
        }

        data[end++] = d;
        return true;
    }

    boolean isFull() {
        return end == data.length;
    }

    int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty!");
        }
        int removed = data[0];
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end -= 1;
        return removed;
    }

    int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Queue!");
        }
        return data[0];
    }

    int rear() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty Queue!");
        }
        return data[end-1];
    }

    boolean isEmpty() {
        return end == 0;
    }

    void print() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
    }
}

public class CustomQueue {
    public static void main(String[] args) throws Exception {
        Queue queue = new Queue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.print();
        System.out.println();
        System.out.println("front-" + queue.front());
        System.out.println("rear-" + queue.rear());
        System.out.println("Removed-" + queue.remove());
        System.out.println("Removed-" + queue.remove());
        System.out.println("Removed-" + queue.remove());
        System.out.println("Removed-" + queue.remove());
        queue.print();

    }
}
