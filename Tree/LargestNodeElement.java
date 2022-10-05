import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class LargestNodeElement {

    static TreeNode create() {
        System.out.println("Enter Node Data: ");
        Scanner sc = new Scanner(System.in);
        int nt = sc.nextInt();
        TreeNode root = new TreeNode(nt);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            System.out.println("Enter number of Chidlren for " + t.data);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + i + "th node of " + t.data);
                int node = sc.nextInt();
                TreeNode ne = new TreeNode(node);
                t.children.add(ne);
                q.add(ne);
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

    static int findLargest(TreeNode root) {
        if (root == null)
            return -1;
        int ans = root.data;
        for (int i = 0; i < root.children.size(); i++) {
            int t = findLargest(root.children.get(i));
            if (ans < t) {
                ans = t;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = create();
        print(root);
        System.out.println("Largest Node:"+findLargest(root));
    }
}