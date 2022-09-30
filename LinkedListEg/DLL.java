
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
    }
}

public class DLL {
    public static Node head;

    public static void insertAtFirst(int d) {
        Node node = new Node(d);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public static void insertAtLast(int d) {
        Node node = new Node(d);
        if (head == null) {
            head = node;
            return;
        }
        node.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }

    public static void insertAtIndex(int d, int i) {
        Node node = new Node(d);
        int j = 0;
        Node temp = head;
        if (i == 0) {
            insertAtFirst(d);
            return;
        }
        while (j < i - 1) {
            temp = temp.next;
            j++;
        }
        if (temp == null) {
            insertAtLast(d);
            return;
        }
        node.next = temp.next;
        temp.next = node;
        node.next.prev = node;

    }

    public static void insertAfterData(int data, int d) {
        Node node = new Node(d);
        Node temp = head;
        while (temp.data != data) {
            temp = temp.next;
        }
        if (temp.next == null) {
            insertAtLast(d);
            return;
        }
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
    }

    public static void deleteAtFirst() {
        if (head == null) {
            return;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public static void deleteLast() {
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    public static void deleteAtIndex(int i){
        if(i==0){
            deleteAtFirst();
            return;
        }
        int j =0;
        Node temp = head;
        while(j<i-1){
            temp=temp.next;
            j++;
        }
        if(temp.next==null){
            deleteLast();
            return;
        }
        temp.next = temp.next.next;
        temp.next.prev=temp;
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        insertAtFirst(10);
        insertAtFirst(11);
        insertAtLast(30);
        insertAtLast(33);
        insertAtIndex(99, 5);
        insertAfterData(99, 88);
        deleteAtFirst();
        deleteLast();
        deleteAtIndex(0);
        print();
    }
}
