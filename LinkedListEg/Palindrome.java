import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class Palindrome {
    public static Node<Integer> create() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> reverse(Node<Integer> head) {
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while (curr != null) {
            Node<Integer> next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }

    public static boolean isPalindrome(Node<Integer> head, Node<Integer> reversed) {
        while (head != null) {
            if (head.data != reversed.data) {
                return false;
            }
            head = head.next;
            reversed = reversed.next;
        }
        return true;
    }

    public static void print(Node<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = create();
        Node<Integer> reversed = reverse(head);
        print(reversed);
        System.out.println(isPalindrome(head, reversed));
    }
}
