import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class DeleteAtPosition {
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

    public static Node<Integer> delete(Node<Integer> head, int pos) {
        Node<Integer> temp = head;
        int i = 0;
        if (pos == 0) {
            head = head.next;
            return head;
        }
        while (i < pos - 1) {
            temp = temp.next;
            i++;
            if(temp.next==null)
            return head;
        }
        if (temp.next.next == null) {
           temp.next = null;
            return head;
        }
        temp.next = temp.next.next;
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
        head = delete(head, 3);
        print(head);

    }
}
