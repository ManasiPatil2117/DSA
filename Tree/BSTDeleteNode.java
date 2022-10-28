import java.util.*;

class BST {
    int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
    }
}

public class BSTDeleteNode {
    static Scanner sc = new Scanner(System.in);

    static BST create() {
        System.out.println("Enter root data: ");
        int rt = sc.nextInt();
        BST root = new BST(rt);
        Queue<BST> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BST n = q.poll();
            System.out.println("Enter left child of " + n.data);
            int l = sc.nextInt();
            if (l != -1) {
                BST left = new BST(l);
                n.left = left;
                q.add(left);
            }
            System.out.println("Enter right child of " + n.data);
            int r = sc.nextInt();
            if (r != -1) {
                BST right = new BST(r);
                n.right = right;
                q.add(right);
            }
        }
        return root;
    }

    static int max(BST root) {
        if (root == null)
            return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    static BST delete(BST root, int data) {
        if (root == null)
            return null;
        if (root.data == data) {
            if (root.left == null && root.right == null)
                return null;
            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                int t = max(root.left);
                root.data = t;
                root.left = delete(root.left, t);
            }
        } else if (root.data > data) {
            root.left = delete(root.left, data);
        } else if (root.data < data)
            root.right = delete(root.right, data);
        return root;
    }

    static void print(BST root) {
        Queue<BST> q = new LinkedList<>();
        q.add(root);
        if (root == null)
            return;
        while (!q.isEmpty()) {
            BST n = q.poll();
            String s = n.data + ": ";
            if (n.left != null) {
                s += "L: " + n.left.data + ", ";
                q.add(n.left);
            }
            if (n.right != null) {
                s += "R: " + n.right.data;
                q.add(n.right);
            }
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        BST root = create();
        root = delete(root, 10);
        print(root);

    }
}
