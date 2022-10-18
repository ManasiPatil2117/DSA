import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class BinaryTreeNode {
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int data) {
        this.data = data;
    }
}

public class BTCountNodes {
    static BinaryTreeNode create() {
        System.out.println("Enter root data: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        BinaryTreeNode root = new BinaryTreeNode(r);
        Queue<BinaryTreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            BinaryTreeNode n = q.poll();
            System.out.println("Enter left child of " + n.data);
            int l = sc.nextInt();
            if (l != -1) {
                BinaryTreeNode left = new BinaryTreeNode(l);
                n.left = left;
                q.add(left);
            }
            System.out.println("Enter right child of " + n.data);
            int rc = sc.nextInt();
            if (rc != -1) {
                BinaryTreeNode right = new BinaryTreeNode(rc);
                n.right = right;
                q.add(right);
            }
        }
        return root;
    }

    static int count(BinaryTreeNode root) {
        if (root == null) {
            return 0;
        }
        int a =1;
        a+= count(root.left) ;
        a+= count(root.left) ;
        return a;

    }

    public static void main(String[] args) {
        BinaryTreeNode root = create();
        System.out.println(count(root));
    }
}
