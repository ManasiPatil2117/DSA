
// Here I have used Hashset to check the loop so it is taking O(n) space complexity and time complexity is O(n) as well
import java.util.HashSet;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class DetectLoop_3 {
    public static void push(Node node, int data) {
        Node d = new Node(data);
        while (node.next != null) {
            node = node.next;
        }
        node.next = d;
    }

    public static boolean checkLoop(Node head) {
        HashSet hash = new HashSet<Node>();
        while (head != null) {
            if (hash.contains(head)) {
                return true;
            }
            hash.add(head);
            head = head.next;
        }
        return false;
    }

    public static void insertLoop(Node head, int pos) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        int i = 0;
        while (i < pos - 1) {
            i++;
            head = head.next;
        }
        temp.next = head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(10);
        push(node, 20);
        push(node, 30);
        push(node, 40);
        System.out.println(checkLoop(node));
        insertLoop(node, 2);
        // print(node);
        System.out.println(checkLoop(node));

    }
}
