import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class PrintLinkedList {
    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node<Integer> createList()
    {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        while (data != -1) {
            Node<Integer> node = new Node<>(data);
            if (head == null)
                head = node;
            else {
                Node<Integer> temp = head;
                while (temp.next != null)
                    temp = temp.next;
                temp.next = node;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static void main(String[] args) {
        // Node<Integer> n1 = new Node<>(10);
        // Node<Integer> n2 = new Node<>(20);
        // Node<Integer> n3 = new Node<>(30);
        // n1.next = n2;
        // n2.next = n3;
        // Node<Integer> head = n1;
        // print(head);
        // print(head);

        Node<Integer> head = createList();
        print(head);
    }
}
