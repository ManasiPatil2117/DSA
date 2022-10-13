import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class StructurallyIdentical {
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

    static boolean r = true;

    static boolean compare(TreeNode root1, TreeNode root2) {
        
        if (root1.data != root2.data) {
            r = false;
        }
        for (int i = 0; i < root1.children.size(); i++) {
            r &= compare(root1.children.get(i), root2.children.get(i));
        }
        return r;

    }

    public static void main(String[] args) {
        TreeNode root1 = create();
        TreeNode root2 = create();
        System.out.println(compare(root1, root2));
    }
}
