class BST {
    int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
    }
}

public class BSTSearchNode {
    static BST create(BST root, int data) {
        if (root == null) {
            BST r = new BST(data);
            return r;
        }
        if (data < root.data) {
            root.left = create(root.left, data);
        } else
            root.right = create(root.right, data);
        return root;
    }

    static void print(BST root) {
        if (root == null) {
            return;
        }
        String s = root.data + ":";
        if (root.left != null)
            s += "L: " + root.left.data + " ";
        if (root.right != null)
            s += "R: " + root.right.data + " ";
        System.out.println(s);
        print(root.left);
        print(root.right);
    }

    static boolean search(BST root, int data) {
        if (root == null)
            return false;
        if (root.data == data) {
            return true;
        } else if (data < root.data) {
            return search(root.left, data);
        } else
            return search(root.right, data);
    }

    public static void main(String[] args) {
        BST root = create(null, 50);
        create(root, 30);
        create(root, 80);
        create(root, 90);
        create(root, 10);
        print(root);
        System.out.println(search(root, 90));
    }
}
