class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class CLL {

    static Node head, tail;

    public static void insertAtStart(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
            tail.next = head;
            return;
        }
        n.next = head;
        tail.next = n;
        head = n;
    }

    static void insertAtLast(int data) {
        Node n = new Node(data);
        if (head == null) {
            insertAtStart(data);
            return;
        }
        tail.next = n;
        n.next = head;
        tail = n;
    }

    public static void insertAtIndex(int i, int data) {
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
        }
        n.next = temp.next;
        temp.next = n;
    }

    public static void deleteFirst() {
        if (head == null)
            return;
        tail.next = head.next;
        head = head.next;
    }

    public static void deleteLast() {
        Node n = head;
        while (n != tail) {
            n = n.next;
        }
        n.next = head;
    }

    public static void deleteAtIndex(int i){
        if(i==0){
            deleteFirst();
            return;
        }
        int j =0;
        Node t=head;
        while(j<i-1){
            t=t.next;
            j++;
        }
        t.next=t.next.next;
    }

    public static void print() {
        Node temp = head;
        if (head != null)
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        insertAtStart(10);
        insertAtStart(20);
        insertAtStart(30);
        insertAtLast(50);
        insertAtLast(56);
        insertAtIndex(5, 99);
        print();
        // deleteFirst();
        // deleteLast();
        deleteAtIndex(4);
        print();
    }
}
