import java.util.*;

class TreeNode {
    int data;
    ArrayList<TreeNode> children;

    TreeNode(int data) {
        this.data = data;
        children = new ArrayList<>();
    }
}

public class NodesGreaterThanX {
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
    static int ct=0;
    static void find(TreeNode root, int x){
        if(root ==null){
            return;
        }
        if(root.data>x){
            ct++;
        }
        for(int i = 0;i<root.children.size();i++)
            find(root.children.get(i),x);
    }

    public static void main(String[] args) {
        TreeNode root = create();
        System.out.println("Enter X:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        find(root,x);
        System.out.println(ct);
    }

}
