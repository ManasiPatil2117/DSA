package Queue;
import java.util.*;

public class GenericQueue {
    public static void main(String[] args) {
        // Queue is an interface
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.size());
    }
}
