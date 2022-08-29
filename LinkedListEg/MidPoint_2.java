// by slow and fast pointer without calculating length of LL
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MidPoint_2 {
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
       Node slow = head, fast=head;
       while(fast.next.next!=null ){
           fast = fast.next.next;
           slow = slow.next;
        if(fast.next==null){
            return slow.data;
        }
       }
        return slow.data;
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