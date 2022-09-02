import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class ReverseRecursively {
    public static Node create() {
        Node head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node newnode = new Node(data);
            if (head == null) {
                head = tail = newnode;
            } else {
                tail.next = newnode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node printReverse(Node head) {
        if (head == null || head.next == null)
            return head;
        Node finalHead = printReverse(head.next);
        Node temp = finalHead;
        while (temp.next != null)
            temp = temp.next;
        temp.next = head;
        head.next = null;
        return finalHead;
    }
    public static void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    public static void main(String[] args) {
        Node head = create();
        head = printReverse(head);
        print(head);
    }
}
