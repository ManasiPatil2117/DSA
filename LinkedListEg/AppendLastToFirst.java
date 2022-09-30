import java.util.Scanner;

import CP.Node;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}
public class AppendLastToFirst {
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
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static Node<Integer> insert(Node<Integer> head, int n ){
        int i =0;
        Node<Integer> temp = head;
        while(temp.next!=null){
            temp =temp.next;
            i++;
        }
        System.out.println("TE"+temp.data);
        temp.next = head;
        temp=head;
        i=i-n;
        int t =0;
        while(t<i){
            temp = temp.next;
            t++;
        }
        head=temp.next;
        temp.next=null;        
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head= create();
        System.out.println("Created");
        head=insert(head, 4);
        print(head);
    }
}
