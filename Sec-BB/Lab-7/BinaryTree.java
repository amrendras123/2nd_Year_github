import java.util.Scanner;

public class BinaryTree{

    class Node{
      int val;
      Node left;
      Node right;
    };
   private Node root;
   Scanner sc=new Scanner(System.in);
    public void Ct(){
        this.root=createTree();
    }
    private Node createTree(){
        Node nn=new Node();
        int data=sc.nextInt();
        nn.val=data;
       boolean hlc=sc.nextBoolean();//hlc=has left child
       if(hlc){
        nn.left=createTree();
       }
       boolean hrc=sc.nextBoolean();//hrc=has right child
       if(hrc){
        nn.right=createTree();
       }
        return nn;
    }
    //ore-Order

    public void preOrder(Node root){
       if(root==null){
        return ;
       }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //in-order
      public void inOrder(Node root){
       if(root==null){
        return ;
       }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    //post-order
    public void postOrder(Node root){
       if(root==null){
        return ;
       }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
}