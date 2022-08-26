package LinkedListEg;

// package LinkedList;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

public class PrintLinkedList {
    public static void main(String[] args) {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        n1.next = n2;
        n2.next = n3;
        Node<Integer> head = n1;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
