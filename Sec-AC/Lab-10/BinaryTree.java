import java.util.Scanner;

public class BinaryTree {

    class Node{
        int data;
        Node left;
        Node right;
    };
    Scanner sc=new Scanner(System.in);
    private Node root;
    public void createTree(){
        this.root=creatTree();
    }

    private Node creatTree(){

        Node nn=new Node();
        int val=sc.nextInt();
        nn.data=val;

        boolean hlc=sc.nextBoolean();//hlc=has left child
        if(hlc){
           nn.left=creatTree();
        }
        boolean hrc=sc.nextBoolean();//hrc=has right child
        if(hrc){
            nn.right=creatTree();
        }
        return nn;
    }
    public void display(){
        display(root);
    }
    private void display(Node root){
       
        String s="";
        if(root==null){
            return ;
        }
        s=s+root.data;
        s="<-"+s+"->";
        if(root.left!=null){
            s=root.left.data+s;
        }else{
            s="."+s;
        }
        if(root.right!=null){
            s=s+root.right.data;
        }else{
            s=s+".";
        }
        System.out.println(s);
        display(root.left);
        display(root.right);

    }
    public int max(){
        return max(root);
    }
    private int max(Node root){

        if(root==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(root.left);
        int rmax=max(root.right);

        return Math.max(lmax,Math.max(rmax,root.data));
    }
     public int min(){
        return min(root);
    }
    private int min(Node root){

        if(root==null){
            return Integer.MAX_VALUE;
        }
        int lmax=max(root.left);
        int rmax=max(root.right);

        return Math.min(lmax,Math.min(rmax,root.data));
    }
    public boolean find(int val){
        return find(root,val);
    }
    private boolean find(Node root,int tar){
        if(root==null){
            return false;
        }
        if(root.data==tar){
            return true;
        }

        boolean lf=find(root.left, tar);
        boolean rf=find(root.right, tar);
        return lf||rf;
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
     public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root==null){
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");

    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public int cnt(){
        return cnt(root);
    }
    private int cnt(Node root){
        if(root==null){
            return 0;
        }
        int lc=cnt(root.left);
        int rc=cnt(root.right);
        return lc+rc+1;
    }
}