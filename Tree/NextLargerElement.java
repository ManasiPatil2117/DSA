import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class NextLargerElement {
    static Scanner sc = new Scanner(System.in);

    static TreeNode create() {
        System.out.println("Enter root: ");
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            System.out.println("Enter number of children for " + n.data);
            int d = sc.nextInt();
            for (int i = 0; i < d; i++) {
                System.out.println("Enter " + i + "th child of " + n.data);
                int ch = sc.nextInt();
                TreeNode child = new TreeNode(ch);
                q.add(child);
                n.children.add(child);
            }
        }
        return root;

    }

    static void find(TreeNode root, int x) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int r = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            if (t.data > x) {
                if (r > t.data) {
                    r = t.data;
                }
            }
            for (int i = 0; i < t.children.size(); i++)
                q.add(t.children.get(i));
        }
        System.out.println(r);

    }

    public static void main(String[] args) {
        TreeNode root1 = create();
        find(root1, 18);
    }
}
