import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BSTfromSortedArray {
    static BinaryTreeNode create(int[] arr, int s, int e) {
        if (s > e) {
            return null;
        }
        int mid = s + (e - s) / 2;
        BinaryTreeNode root = new BinaryTreeNode(mid);
        root.left = create(arr, s, mid - 1);
        root.right = create(arr, mid + 1, e);
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
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        BinaryTreeNode root = create(arr, 1, arr.length);
        print(root);
    }
}
