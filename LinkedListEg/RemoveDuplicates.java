class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class RemoveDuplicates {
    static Node head, tail;

    public static void insert(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
            return;
        }
        tail.next = n;
        tail = tail.next;

    }

    public static void remove() {
        Node n = head;
        while (n.next != null) {
            if (n.data == n.next.data) {
                n.next = n.next.next;
            } else
                n = n.next;
        }
    }

    public static void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        insert(1);
        insert(1);
        insert(1);
        insert(2);
        insert(3);
        insert(3);
        insert(4);
        print();
        remove();
        print();
    }

}
