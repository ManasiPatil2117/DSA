class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {

    static int i = -1;

    static Node add(int[] e) {
        i++;
        if (e[i] == -1)
            return null;
        Node n = new Node(e[i]);
        n.left = add(e);
        n.right = add(e);
        return n;
    }

    static void print(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    static int count(Node root) {
        if (root == null)
            return 0;
        return count(root.left) + count(root.right) + 1;
    }

    static int sum(Node root) {
        if (root == null)
            return 0;
        return sum(root.left) + sum(root.right) + root.data;
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }
}

public class BTCount_SumNodes {
    public static void main(String[] args) {
        int e[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree b = new BinaryTree();
        Node root = b.add(e);
        b.print(root);
        System.out.println("Count: " + b.count(root));
        System.out.println("Sum: " + b.sum(root));
        System.out.println("Height: " + b.height(root));
    }
}
