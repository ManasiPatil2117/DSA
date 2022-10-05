//     10

// 30  40  60

//    4  9
import java.util.ArrayList;

class TreeNode {
    int data;
    ArrayList<TreeNode> child;

    TreeNode(int data) {
        this.data = data;
        child = new ArrayList<>();
    }
}

public class TreeEg {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode n1 = new TreeNode(30);
        TreeNode n2 = new TreeNode(40);
        TreeNode n3 = new TreeNode(60);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(9);
        root.child.add(n1);
        root.child.add(n2);
        root.child.add(n3);
        n2.child.add(n4);
        n2.child.add(n5);
        System.out.println(root.data);
        System.out.println(root.child.get(0).data);
    }
}
