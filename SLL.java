/**
 * SLL
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class SLL {

    private static Node head = null, tail = head;

    public static void insertAtEnd(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = tail.next;
        }
    }

    public static void insertAtStart(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = tail = n;
        } else {
            n.next = head;
            head = n;
        }
    }

    public static void insertAtIndex(int data, int i) {
        Node n = new Node(data);
        int j = 0;
        Node temp = head;
        if (i == 0) {
            insertAtStart(data);
            return;
        }
        while (j < i - 1) {
            temp = temp.next;
            j++;
            if (temp == null) {
                System.out.println("Cannnot insert! Invalid Index");
                return;
            }
        }
        n.next = temp.next;
        temp.next = n;
    }

    public static void deleteFirst() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else {
            head = head.next;
        }
    }

    public static void deleteLast() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public static void deleteAtIndex(int i) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        } else {
            if (i == 0) {
                deleteFirst();
                return;
            }
            int j = 0;
            Node temp = head;
            while (j < i - 1) {
                temp = temp.next;
                j++;
                if (temp == null || temp.next == null) {
                    System.out.println("Invalid Index");
                    return;
                }
            }
            temp.next = temp.next.next;
        }
    }

    public static void print() {
        Node temp = head;
        if (temp == null) {
            return;
        } else {
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.print("NULL");
        }
    }

    public static void main(String[] args) {
        head = tail = new Node(1);
        // insertAtStart(2);
        insertAtEnd(2);
        insertAtEnd(3);
        insertAtEnd(4);
        // insertAtIndex(20, 0);
        // deleteFirst();
        // deleteLast();
        deleteAtIndex(7);
        print();
    }
}