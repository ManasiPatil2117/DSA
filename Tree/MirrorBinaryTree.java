import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class MirrorBinaryTree {
    static Scanner sc = new Scanner(System.in);

    static BinaryTreeNode create() {
        System.out.println("Enter root Data: ");
        int rt = sc.nextInt();
        BinaryTreeNode root = new BinaryTreeNode(rt);
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
            System.out.println("Enter left node of " + n.data);
            int l = sc.nextInt();
            if (l != -1) {
                BinaryTreeNode left = new BinaryTreeNode(l);
                n.left = left;
                q.add(left);
            }
            System.out.println("Enter right node of " + n.data);
            int r = sc.nextInt();
            if (r != -1) {
                BinaryTreeNode right = new BinaryTreeNode(r);
                n.right = right;
                q.add(right);
            }
        }
        return root;
    }

    static BinaryTreeNode mirror(BinaryTreeNode root) {
        if (root == null) {
            return null;
        }
        BinaryTreeNode left = mirror(root.right);
        root.right = mirror(root.left);
        root.left = left;
        return root;
    }

    static void mirror2(BinaryTreeNode root) {
        if (root == null) {
            return;
        }
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
            BinaryTreeNode temp = n.left;
            n.left = n.right;
            n.right = temp;
            if (n.left != null)
                q.add(n.left);
            if (n.right != null)
                q.add(n.right);
        }
        print(root);
    }

    static void print(BinaryTreeNode root) {
        if (root == null)
            return;
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        // System.out.print(root.data);
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
            if (n == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else
                    q.add(null);
            } else {
                System.out.print(n.data + " ");
                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    // System.out.print(n.right.data + " ");
                    q.add(n.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode root = create();
        System.out.println("Tree before Mirror: ");
        print(root);
        System.out.println("Tree After Mirror: ");
        mirror2(root);
    }

}
