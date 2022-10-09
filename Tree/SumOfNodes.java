import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}
public class SumOfNodes {
    static TreeNode create() {
        System.out.println("Enter root node:");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        TreeNode root = new TreeNode(r);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            System.out.println("Enter number of children for " + n.data);
            int c = sc.nextInt();
            for (int i = 0; i < c; i++) {
                System.out.println("Enter " + i + "th child of " + n.data);
                int da = sc.nextInt();
                TreeNode d = new TreeNode(da);
                n.children.add(d);
                q.add(d);
            }
        }
        return root;

    }
    static int sum(TreeNode root){
        if (root== null)
        return 0;
        int s = root.data;
        for(int i =0;i<root.children.size();i++)
            s+= sum(root.children.get(i));
            return s;
    }
    public static void main(String[] args) {
        TreeNode root = create();
        System.out.print( sum(root));
    }
}
