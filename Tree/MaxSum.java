import java.util.*;

import javax.management.QueryEval;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class MaxSum {
    static TreeNode create(Scanner sc) {
        System.out.println("Enter root data: ");
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            System.out.println("Enter number of children for " + t.data);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + i + "th child of " + t.data);
                int ch = sc.nextInt();
                TreeNode child = new TreeNode(ch);
                t.children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    static void print(TreeNode root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s += " " + root.children.get(i).data;
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++)
            print(root.children.get(i));
    }

    static int a = 0, max = 0;

    static void find(TreeNode root) {
        if (root == null)
            return;
        int s = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            s += root.children.get(i).data;
            find(root.children.get(i));
        }
        if (max < s) {
            max = s;
            a = root.data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode t = create(sc);
        print(t);
        find(t);
        System.out.println("node: " + a);

    }
}