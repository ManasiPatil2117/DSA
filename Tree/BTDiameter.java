class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    int height;
    int diameter;
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
        System.out.print(root.data + " ");
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
        int diameter3 = height(root.left) + height(root.right);
        return Math.max(Math.max(diameter1, diameter2), diameter3);
    }

    // Time complexity - O(N)
    Pair diameterO(Node root) {
        if (root == null) {
            Pair o = new Pair();
            return o;
        }
        Pair left = diameterO(root.left);
        Pair right = diameterO(root.right);
        int height = 1 + Math.max(left.height, right.height);
        int o1 = left.height + right.height;
        int o2 = left.diameter;
        int o3 = right.diameter;
        int dia = Math.max(o1, Math.max(o2, o3));
        Pair o = new Pair();
        o.height = height;
        o.diameter = dia;
        return o;
    }
}

public class BTDiameter {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        int[] a = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = bt.add(a);
        bt.print(root);
        System.out.println("\nDiameter: " + bt.diameter(root));
        Pair o = bt.diameterO(root);
        System.out.println("Height using Pair: " + o.height);
        System.out.println("Diameter using Pair: " + o.diameter);
    }
}
