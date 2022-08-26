import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class InsertAtPosition {
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

    public static Node<Integer> insert(Node<Integer> head, int pos, int ele) {
        Node<Integer> temp = head;
        Node<Integer> newnode = new Node<>(ele);
        if (pos == 0) {
            newnode.next = head;
            return newnode;
        }
        int i = 0;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        return head;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = create();
        // print(head);
        head = insert(head, 0, 80);
        print(head);
    }
}
