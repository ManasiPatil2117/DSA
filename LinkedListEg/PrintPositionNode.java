
import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data){
      this.data = data;
    }
  }

public  class PrintPositionNode{

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

    public static void find(Node<Integer> head, int pos){
        int i =0;
        while(i<pos){
            head= head.next;
            i++;
        }
        System.out.println(head.data);
    }

    public static void print(Node<Integer> head){
		Node<Integer> temp = head;

		while(temp != null){
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
	}
  
	public static void main(String args[]){
	
		Node<Integer> node1 = create();
        find(node1,3);
       }
   }