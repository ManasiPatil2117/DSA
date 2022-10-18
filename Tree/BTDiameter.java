class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
     int i = -1;

     Node add(int[] a) {
        i++;
        if (a[i] == -1)
            return null;
        Node n = new Node(a[i]);
        n.left = add(a);
        n.right = add(a);
        return n;
    }

     void print(Node root) {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }

     int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    // Time complexity - O(N^2) ||O(N*H)
     int diameter(Node root) {
        if (root == null)
            return 0;
        int diameter1 = diameter(root.left);
        int diameter2 = diameter(root.right);
        int diameter3 = height(root.left) + height(root.right) + 1;
        return Math.max(Math.max(diameter1, diameter2), diameter3);
    }
}

public class BTDiameter {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] a = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = bt.add(a);
        bt.print(root);
        System.out.println("\nDiameter: " + bt.diameter(root));
    }
}
