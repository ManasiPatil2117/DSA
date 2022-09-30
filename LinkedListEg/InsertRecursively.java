
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

}

public class InsertRecursively {

    public static Node insert1(int data, Node head) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node t = head;
            while (t.next != null) {
                t = t.next;
            }
            t.next = n;
        }
        return head;
    }

    public static Node insert(int i, int val, Node head) {
        if(i==0){
            Node n = new Node(val);
            n.next=head;
            return n;
        }
        head.next = insert(i-1, val, head.next);
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head = insert1(20, head);
        head = insert1(30, head);
        head = insert1(40, head);
        head= insert(0,11,head);
        print(head);
    }

}