import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class PrintAtDepth {
    static TreeNode create() {
        System.out.println("Enter root node data:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            System.out.println("Enter number of children for " + n.data);
            int no = sc.nextInt();
            for (int i = 0; i < no; i++) {
                System.out.println("Enter " + i + "th child of " + n.data);
                int c = sc.nextInt();
                TreeNode child = new TreeNode(c);
                n.children.add(child);
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

    static void printElementsAtDepth(TreeNode root, int d) {
        if (d < 0) {
            return;
        }
        if (d == 0) {
            System.out.println(root.data);
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            printElementsAtDepth(root.children.get(i), d - 1);
        }

    }

    public static void main(String[] args) {
        TreeNode root = create();
        print(root);
        printElementsAtDepth(root, 2);
    }
}
