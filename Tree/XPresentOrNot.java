import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class XPresentOrNot {
    static TreeNode create() {
        System.out.println("Enter root node: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            System.out.println("Enter number of children for " + n.data);
            int ch = sc.nextInt();
            for (int i = 0; i < ch; i++) {
                System.out.println("Enter " + i + "th child of " + n.data);
                int c = sc.nextInt();
                TreeNode child = new TreeNode(c);
                n.children.add(child);
                q.add(child);
            }
        }
        return root;
    }

    static boolean find(TreeNode root, int x) {
        if (root == null)
            return false;

        boolean r = x == root.data ? true : false;
        for (int i = 0; i < root.children.size(); i++) {
            r = r || find(root.children.get(i), x);
        }
        return r;

    }

    public static void main(String[] args) {
        TreeNode root = create();
        System.out.println("Enter X:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        System.out.println(find(root, x));
    }

}