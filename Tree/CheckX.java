import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class CheckX {
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

    static boolean find(BinaryTreeNode root, int x) {
        if (root == null)
            return false;
        boolean r = false;
        if (root.data == x)
            r = true;
        r |= find(root.left, x);
        r |= find(root.right, x);
        return r;

    }

    public static void main(String[] args) {
        BinaryTreeNode root = create();
        System.out.println("Enter element to search: ");
        int x = sc.nextInt();
        System.out.println(find(root, x));
    }

}
