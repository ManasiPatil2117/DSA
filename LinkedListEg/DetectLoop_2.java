// deteting loop in linked list by changing its structure, i have changed the link of each traversed node to the temp 
// time Complexity is O(n)
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class DetectLoop_2 {
    public static void push(Node node, int data) {
        Node d = new Node(data);
        while (node.next != null) {
            node = node.next;
        }
        node.next = d;
    }

    public static boolean checkLoop(Node head) {
        Node cur = head;
        Node temp = new Node(10);
        while (head != null) {
            if (head.next == null)
                return false;
            cur = head.next;
            head.next = temp;
            head = cur;
            if (head.next == temp)
                return true;
        }
        return true;
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
