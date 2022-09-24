import java.util.Scanner;

/**
 * Test
 */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Test {
    public static Node create() {
        Node head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node n = new Node(data);
            if (head == null) {
                head = tail = n;
            } else {
                tail.next = n;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node insertAtFirst(Node head, int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head = n;
        }
        return head;
    }

    public static Node insertAtEnd(Node head, int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
        }
        return head;
    }

    public static Node insertAtIndex(Node head, int i, int data) {
        Node n = new Node(data);
        int j = 0;
        Node temp = head;
        while (j < i - 1) {
            if (temp == null || temp.next == null) {
                System.out.println("Invalid Index");
                return head;
            }
            j++;
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
        return head;
    }

    public static Node deleteFirst(Node head) {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            head = head.next;
        }
        return head;
    }

    public static Node deleteLast(Node head) {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            Node t = head;
            if (head.next == null) {
                head = null;
            } else
                while (t.next.next != null) {
                    t = t.next;
                }
            t.next = null;
        }
        return head;
    }

    public static Node deleteIndex(Node head, int i) {
        if (head == null) {
            System.out.println("Empty List");
        } else {
            if (i == 0) {
                head = deleteFirst(head);
            } else {
                int j = 0;
                Node t = head;
                while (j < i - 1) {
                    t = t.next;
                    j++;
                }
                if(t==null||t.next==null){
                    System.out.println("Invalid index");
                    return head;
                }
                Node l=t.next.next;
                t.next = l;
            }
        }
        return head;
    }

    public static void print(Node head) {
        if (head != null) {
            while (head != null) {
                System.out.print(head.data + " -> ");
                head = head.next;
            }
            System.out.print("NULL\n");
        }
    }

    public static void main(String[] args) {
        Node head = create();
        head = insertAtFirst(head, 10);
        System.out.println("After inserting at 1st position");
        print(head);
        head = insertAtEnd(head, 90);
        System.out.println("After inserting at end");
        print(head);
        head = insertAtIndex(head, 2, 999);
        System.out.println("After inserting at 2nd position");
        print(head);
        head = deleteFirst(head);
        System.out.println("After deleting 1st ele");
        print(head);
        head = deleteLast(head);
        System.out.println("After deleting last ele");
        print(head);
        head = deleteIndex(head, 2);
        System.out.println("After deleting at index");
        print(head);
    }
}