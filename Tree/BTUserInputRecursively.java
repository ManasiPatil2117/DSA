import java.util.Scanner;

class BinaryTreeNode{
    int data;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int data){
        this.data = data;
    }
}
public class BTUserInputRecursively {
    static BinaryTreeNode create(){
        System.out.println("Enter node data: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        if(r==-1){
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(r);
        root.left=create();
        root.right=create();
        return root;
    }
    static void print(BinaryTreeNode root){
        if(root == null){
            return;
        }
        String s = root.data + ": ";
        if(root.left!=null){
            s+="L: "+ root.left.data+", ";
        }
        if(root.right!=null){
            s+="R: "+root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    }
    public static void main(String[] args) {
        BinaryTreeNode root = create();
        print(root);

    }    
}
