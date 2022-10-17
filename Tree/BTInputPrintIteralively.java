import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BTInputPrintIteralively {
    static BinaryTreeNode create() {
        System.out.println("Enter root Data: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        BinaryTreeNode root = new BinaryTreeNode(r);
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
            System.out.println("Enter left child of " + n.data);
            int l = sc.nextInt();
            if (l != -1) {
                BinaryTreeNode left = new BinaryTreeNode(l);
                n.left = left;
                q.add(left);
            }
            System.out.println("Enter right child of " + n.data);
            int rc = sc.nextInt();
            if (rc != -1) {
                BinaryTreeNode right = new BinaryTreeNode(rc);
                n.right = right;
                q.add(right);
            }
        }
        return root;
    }

    static void print(BinaryTreeNode root) {
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        if (root == null)
            return;
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
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
        BinaryTreeNode root = create();
        print(root);
    }
}
