/**
 * DetectLoop_1 by adding boolean visited member to linked list i.e. by changing the structure of linked list
 */
class Node<T> {
    T data;
    Node<T> next;
    boolean visited;

    Node(T data) {
        this.data = data;
        next = null;
        visited = false;
    }
}

public class DetectLoop_1 {
    public static void push(Node<Integer> head, int data) {
        Node<Integer> node = new Node<>(data);
        while (head.next != null) {
            head = head.next;
        }
        head.next = node;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void insertLoop(Node<Integer> head, int pos) {
        Node<Integer> tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        int i = 0;
        while (i < pos - 1) {
            head = head.next;
            i++;
        }
        tail.next = head.next;
    }

    public static boolean checkLoop(Node<Integer> head) {
        while(head.visited == false) {
            head.visited = true;
            head = head.next;
            if (head.next == null)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Node<Integer> node = new Node<>(10);
        push(node, 20);
        push(node, 30);
        push(node, 40);
        push(node, 50);
        // System.out.println(checkLoop(node));

        insertLoop(node, 3);
        // print(node);
        System.out.println(checkLoop(node));

    }
}