import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class CountLeafNodesBT {
    static Scanner sc = new Scanner(System.in);

    static BinaryTreeNode create() {
        System.out.println("Enter root data: ");
        int rt = sc.nextInt();
        BinaryTreeNode root = new BinaryTreeNode(rt);
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
            System.out.println("Enter left child of " + n.data);
            int l = sc.nextInt();
            if (l != -1) {
                BinaryTreeNode left = new BinaryTreeNode(l);
                q.add(left);
                n.left = left;
            }
            System.out.println("Enter right child of " + n.data);
            int r = sc.nextInt();
            if (r != -1) {
                BinaryTreeNode right = new BinaryTreeNode(r);
                q.add(right);
                n.right = right;
            }
        }
        return root;
    }

    static int getLeaf(BinaryTreeNode root) {
        if (root == null)
            return 0;
        int c = 0;
        if (root.left == null && root.right == null)
            c++;
        c += getLeaf(root.left);
        c += getLeaf(root.right);
        return c;
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
        System.out.println("Number of Leaf Nodes: " + getLeaf(root));

    }
}
