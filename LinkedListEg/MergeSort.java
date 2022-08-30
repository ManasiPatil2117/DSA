import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MergeSort {

    public static Node create() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node head = null, tail = null;
        while (data != -1) {
            Node n = new Node(data);
            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node mid(Node head) {
        if (head == null)
        return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node divide(Node head) {
        if (head == null || head.next == null)
            return head;
        Node midE = mid(head);
        Node head2 = midE.next;
        midE.next = null;
        Node left = divide(head);
        Node right = divide(head2);
        Node sorted = merge(left, right);
        return sorted;
    }

    public static Node merge(Node head, Node head2) {
        Node h3, t3;
        if (head.data <= head2.data) {
            h3 = t3 = head;
            head = head.next;
        } else {
            h3 = t3 = head2;
            head2 = head2.next;
        }
        while (head != null && head2 != null) {
            if (head.data <= head2.data) {
                t3.next = head;
                head = head.next;
            } else {
                t3.next = head2;
                head2 = head2.next;
            }
            t3 = t3.next;
        }
        if (head != null) {
            t3.next = head;
        }
        if (head2 != null) {
            t3.next = head2;
        }
        return h3;
    }
    public static void main(String[] args) {
        Node head = create();
        head = divide(head);
        print(head);
    }
}