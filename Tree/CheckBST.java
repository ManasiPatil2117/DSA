import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class CheckBST {

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

    static int max(BinaryTreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    static int min(BinaryTreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
    }

    static boolean check(BinaryTreeNode root) {
        if (root == null) {
            return true;
        }
        int leftMax = max(root.left);
        int rightmin = min(root.right);
        if (root.data > rightmin || root.data <= leftMax)
            return false;
        // if ()
        // return false;
        return check(root.left) && check(root.right);
    }

    public static void main(String[] args) {
        BinaryTreeNode root = create();
        print(root);
        System.out.println(check(root));
    }
}