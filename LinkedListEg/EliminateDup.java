
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class EliminateDup {
    public static Node<Integer> create() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newnode = new Node<>(data);
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

    public static void print(Node<Integer> head) {
        if (head == null) {
            System.out.println("No elements");
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node<Integer> eliminate(Node<Integer> head) {
        if(head==null){
            return null;
        }
        if(head.next!=null){
            if(head.data==head.next.data){
                head.next = head.next.next;
                eliminate(head);
            }else{
                eliminate(head.next);
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = create();
        System.out.println("Created");
        head = eliminate(head);
        print(head);
    }
}
