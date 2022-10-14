import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class SecondLargest {

    static TreeNode create() {
        System.out.println("Enter root data: ");
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
                int ch = sc.nextInt();
                TreeNode child = new TreeNode(ch);
                n.children.add(child);
                q.add(child);
            }
        }
        return root;

    }

    static int s = 0;
    static int l = 0;

    static void find(TreeNode root) {
        for (int i = 0; i < root.children.size(); i++) {
            find(root.children.get(i));
        }
        if (root.data > l) {
            s = l;
            l = root.data;
        }

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

    public static void main(String[] args) {
        TreeNode root = create();
        print(root);
        find(root);
        System.out.println(s);
    }
}