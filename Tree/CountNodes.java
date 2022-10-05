import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class CountNodes {
    static TreeNode create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root node data:");
        int rd = sc.nextInt();
        TreeNode root = new TreeNode(rd);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.println("Enter number of children for " + node.data);
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.println("Enter " + (i + 1) + "th child of " + node.data);
                int d = sc.nextInt();
                TreeNode c = new TreeNode(d);
                node.children.add(c);
                queue.add(c);
            }
            queue.peek();
        }
        return root;
    }

    static int numberOfNodes(TreeNode root) {
        // This is not a base case. This is a edge case
        // base case is fulfilled by for loop
        if (root == null)
            return 0;
        int c = 1;
        for (int i = 0; i < root.children.size(); i++) {
            c += numberOfNodes(root.children.get(i));
        }
        return c;
    }

    public static void main(String[] args) {
        TreeNode root = create();
        System.out.println(numberOfNodes(root));
    }
}
