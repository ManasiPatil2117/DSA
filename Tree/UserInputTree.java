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

public class UserInputTree {

    static Scanner sc = new Scanner(System.in);
    static TreeNode addNode() {
        System.out.println("Enter next node data: ");
        int n = sc.nextInt();
        TreeNode n1 = new TreeNode(n);
        System.out.println("Enter number of children for " + n);
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            TreeNode child=addNode();
            n1.children.add(child);
        }
        return n1;
    }

    static void print(TreeNode root) {
        String s = root.data+":";
        for (int i = 0; i < root.children.size(); i++) {
            s+=" "+root.children.get(i).data;
        }
        System.out.println(s);
        for(int i = 0 ; i < root.children.size();i++){
            print(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode n = addNode();
        print(n);
    }
}
