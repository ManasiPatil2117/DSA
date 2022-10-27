import java.util.*;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

class Pair<F, S> {
    F first;
    S second;
}

public class CheckBST_2 {
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
                n.left = left;
                q.add(left);
            }
            System.out.println("Enter right child of " + n.data);
            int r = sc.nextInt();
            if (r != -1) {
                BinaryTreeNode right = new BinaryTreeNode(r);
                n.right = right;
                q.add(right);
            }
        }
        return root;
    }

    static Pair<Boolean, Pair<Integer, Integer>> check(BinaryTreeNode root) {
        if (root == null) {
            Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
            output.first = true;
            output.second = new Pair<>();
            output.second.first = Integer.MAX_VALUE;
            output.second.second = Integer.MIN_VALUE;
            return output;
        }
        Pair<Boolean, Pair<Integer, Integer>> leftOutput = check(root.left);
        Pair<Boolean, Pair<Integer, Integer>> rightOutput = check(root.right);
        if (root.data < leftOutput.second.second) {
            leftOutput.first = false;
        }
        if (root.data >= rightOutput.second.first) {
            rightOutput.first = false;
        }
        int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
        int max = Math.max(root.data, Math.max(rightOutput.second.second, leftOutput.second.second));
        Pair<Boolean, Pair<Integer, Integer>> output = new Pair<>();
        output.second = new Pair<>();
        output.first = leftOutput.first && rightOutput.first;
        output.second.first = min;
        output.second.second = max;
        return output;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = create();
        Pair<Boolean, Pair<Integer, Integer>> output = check(root);
        System.out.println(output.first);

    }
}
