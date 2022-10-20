import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class ConstructFromInPreOrder {
    static Scanner sc = new Scanner(System.in);

    static BinaryTreeNode create(int[] in, int[] pre, int is, int ie, int ps, int pe) {
        if (is > ie) {
            return null;
        }
        int rootdata = pre[ps];
        int rootindexIn = -1;
        for (int i = is; i <= ie; i++) {
            if (in[i] == rootdata) {
                rootindexIn = i;
                break;
            }
        }
        if (rootindexIn == -1)
            return null;
        BinaryTreeNode root = new BinaryTreeNode(rootdata);
        int leftInS = is;
        int leftInE = rootindexIn - 1;
        int leftPreS = ps + 1;
        int leftPreE = leftInE - leftInS + leftPreS;
        int rightInS = rootindexIn + 1;
        int rightInE = ie;
        int rightPreS = leftPreE + 1;
        int rightPreE = pe;
        root.left = create(in, pre, leftInS, leftInE, leftPreS, leftPreE);
        root.right = create(in, pre, rightInS, rightInE, rightPreS, rightPreE);
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
        int[] in = { 4, 2, 5, 1, 3, 7 };
        int[] pre = { 1, 2, 4, 5, 3, 7 };
        BinaryTreeNode root = create(in, pre, 0, in.length - 1, 0, pre.length - 1);
        print(root);

    }
}
