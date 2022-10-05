import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class HeightOfTree {

    static TreeNode create() {
        System.out.println("Enter root note: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            System.out.println("Enter number of children of " + t.data);
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                System.out.println("Enter " + i + "th child of " + t.data);
                int ch = sc.nextInt();
                TreeNode child = new TreeNode(ch);
                q.add(child);
                t.children.add(child);
            }
        }
        return root;
    }

    static int height(TreeNode root) {
        if (root == null)
            return 0;
        int l = 1, h = 0;
        for (int i = 0; i < root.children.size(); i++) {
            h = height(root.children.get(i)) + 1;
        }
        if (l < h)
            l = h;
        return l;
    }

    public static void main(String[] args) {
        TreeNode root = create();
        System.out.println(height(root));

    }
}
