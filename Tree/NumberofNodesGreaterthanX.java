import java.util.ArrayList;
import java.util.Scanner;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class NumberofNodesGreaterthanX {
    static TreeNode create() {
        System.out.println("Enter data: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        TreeNode t = new TreeNode(x);
        System.out.println("Enter no of child for " + x);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + i + "th child of " + x);
            TreeNode child = create();
            t.children.add(child);
        }
        return t;
    }

    static void print(TreeNode root) {
        String s = root.data + ":";
        for (int i = 0; i < root.children.size(); i++) {
            s += root.children.get(i).data;
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++) {
            print(root.children.get(i));
        }
    }

    static int find(TreeNode root, int x) {
        int c = 0;
        if (root.data > x) {
            c++;
        }
        for (int i = 0; i < root.children.size(); i++) {
            c += find(root.children.get(i), x);
        }
        return c;
    }

    public static void main(String[] args) {
        TreeNode r = create();
        print(r);
        System.out.println("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Number of Elements greater than " + x + " is: " + find(r, x));
    }

}
