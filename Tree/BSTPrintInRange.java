class BST {
    int data;
    BST left;
    BST right;

    BST(int data) {
        this.data = data;
    }
}

public class BSTPrintInRange {
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

    static void print(BST root, int s, int e) {
        if (root == null)
            return;
        if (root.data >= s && root.data <= e) {
            System.out.println(root.data);
            print(root.left, s, e);
            print(root.right, s, e);
        }

    }

    public static void main(String[] args) {
        BST root = create(null, 50);
        create(root, 40);
        create(root, 80);
        create(root, 30);
        create(root, 90);
        create(root, 20);
        print(root, 20, 50);
    }
}
