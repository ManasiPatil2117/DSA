import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BalancedTree {
    static Scanner sc = new Scanner(System.in);

    static BinaryTreeNode create() {
        System.out.println("Enter root data: ");
        int rt = sc.nextInt();
        BinaryTreeNode root = new BinaryTreeNode(rt);
        Queue<BinaryTreeNode> q = new LinkedList<>();
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

    static int height(BinaryTreeNode root) {
        if (root == null)
            return 0;
        return height(root.left) + height(root.right) + 1;
    }

    static boolean check(BinaryTreeNode root) {
        if (root == null) {
            return false;
        }
        if ((height(root.left) - height(root.right)) <= 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = create();
        System.out.println(check(root));
    }
}
