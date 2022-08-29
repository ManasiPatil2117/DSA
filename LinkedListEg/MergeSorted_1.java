import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        next = null;
    }
}


public class MergeSorted_1 {
    
    public static Node create() {
        Node head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node merge(Node head1, Node head2) {
        Node temp = new Node(0);
        Node cur = temp;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                cur.next = head1;
                head1 = head1.next;
            } else {
                cur.next = head2;
                head2 = head2.next;
            }
            cur = cur.next;
        }
        while (head1 != null) {
            cur.next = head1;
            head1 = head1.next;
            cur = cur.next;
        }

        while (head2 != null) {
            cur.next = head2;
            head2 = head2.next;
            cur = cur.next;
        }
        return temp.next;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node head1 = create();
        Node head2 = create();
        head1 = merge(head1,head2);
        print(head1);

    }
}
