import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    int i = -1;

    Node add(int[] a) {
        i++;
        if (a[i] == -1) {
            return null;
        }
        Node n = new Node(a[i]);
        n.left = add(a);
        n.right = add(a);
        return n;
    }

    void preorder(Node root) {
        if (root == null) {
            System.out.print(-1 + " ");

            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    void levelorder(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node cur = q.remove();
            if (cur == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(cur.data + " ");
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
    }
}

public class BTTraversal {
    public static void main(String[] args) {
        int a[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.add(a);
        System.out.println("Preorder (DFS)-");
        bt.preorder(root);
        System.out.println();
        System.out.println("Inorder (DFS)-");
        bt.inorder(root);
        System.out.println();
        System.out.println("Postorder (DFS)-");
        bt.postorder(root);
        System.out.println();
        System.out.println("Levelorder (BFS)-");
        bt.levelorder(root);
    }
}
