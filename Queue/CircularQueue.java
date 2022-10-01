class CQueue {
    int[] data;
    int size = 0;
    int queueSize = 5;
    int front = 0, end = 0;

    CQueue() {
        data = new int[queueSize];
    }

    CQueue(int s) {
        data = new int[s];
    }

    boolean isFull() {
        return size == data.length;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean insert(int e) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full!");
        }
        data[end % data.length] = e;
        end++;
        size++;
        return true;
    }

    int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Empty queue");
        }
        int removed = front;
        front += 1;
        size--;
        return data[removed];
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Empty queue");
        }
        int i = front;
        do {
            System.out.println(data[i % data.length]);
            i++;
        } while (i != end);
    }
}

public class CircularQueue {
    public static void main(String[] args) throws Exception {
        CQueue circularQueue = new CQueue();
        circularQueue.insert(10);
        circularQueue.insert(20);
        circularQueue.insert(30);
        circularQueue.insert(40);
        circularQueue.insert(50);
        System.out.println("removed-" + circularQueue.remove());
        System.out.println("removed-" + circularQueue.remove());
        System.out.println("removed-" + circularQueue.remove());
        circularQueue.insert(99);
        circularQueue.insert(999);
        circularQueue.insert(9999);
        System.out.println("removed-" + circularQueue.remove());
        circularQueue.insert(99999);
        circularQueue.print();
    }
}
