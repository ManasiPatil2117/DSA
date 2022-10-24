import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class LevelWiseInput {
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

    static void print(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            if (t == null) {
                System.out.println();
                if (q.isEmpty())
                    break;
                else
                    q.add(null);
                continue;
            } else {
                System.out.print(t.data + " ");
                for (int i = 0; i < t.children.size(); i++) {
                    q.add(t.children.get(i));
                }
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = create();
        print(root);
    }
}
