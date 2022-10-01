
class CircularQueue {
    int[] data;
    int size = 0;
    int front = 0, end = 0;

    CircularQueue() {
        data = new int[5];
    }

    CircularQueue(int size) {
        data = new int[size];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == data.length;
    }

    boolean insert(int e) {
        if (isFull()) {
            int temp[] = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        data[end % data.length] = e;
        end++;
        size++;
        return true;
    }

    int remove() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        int r = front;
        front = front + 1;
        size--;
        return data[r];
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
            return;
        }
        int i = front;
        do {
            System.out.println(data[i % data.length]);
            i++;
        } while (i != end);
    }
}

public class CircularDynamicQueue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);
        System.out.println("removed-" + queue.remove());
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.print();
    }
}
