class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class BinaryTree{
   static int i =-1;
    static Node build(int[] nodes){
        i++;
        if(nodes[i]==-1)
            return null;
        Node n = new Node(nodes[i]);
        n.left = build(nodes);
        n.right = build(nodes);
        return n;
    }
}
public class BTPreorder {
    public static void main(String[] args) {
        int a[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root =bt.build(a);
        System.out.println(root.data);
        System.out.println(root.left.left.data);
        System.out.println(root.left.right.data);
    }    
}
