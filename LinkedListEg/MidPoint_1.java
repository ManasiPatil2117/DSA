// By counting the number of nodes and dividing it by 2
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MidPoint_1 {
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

    public static int find(Node head) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        if (i % 2 == 0) {
            i = (i / 2) - 1;
        } else
            i = i / 2;
        int j = 0;
        while (j < i) {
            head = head.next;
            j++;
        }
        return head.data;
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node head = create();
        print(head);
        System.out.println(find(head));
    }
}