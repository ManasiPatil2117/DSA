import java.util.ArrayList;
import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class CountLeafNodes {
    static TreeNode create() {
        System.out.println("Enter root node: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            System.out.println("Enter number of children for " + t.data);
            int d = sc.nextInt();
            for (int i = 0; i < d; i++) {
                System.out.println("Enter " + i + "th node of " + t.data);
                int td = sc.nextInt();
                TreeNode child = new TreeNode(td);
                q.add(child);
                t.children.add(child);
            }
        }
        return root;
    }

    public static void print(TreeNode root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s += " " + root.children.get(i).data;
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++)
            print(root.children.get(i));
    }

    static int c = 0;

    public static int CountLeaf(TreeNode root) {
        if (root == null)
            return 0;
        if (root.children.isEmpty())
            c++;
        for (int i = 0; i < root.children.size(); i++) {
            c = CountLeaf(root.children.get(i));
        }
        return c;
    }

    public static void main(String[] args) {
        TreeNode root = create();
        print(root);
        System.out.println("Number of Leaf Nodes : " + CountLeaf(root));
    }
}
