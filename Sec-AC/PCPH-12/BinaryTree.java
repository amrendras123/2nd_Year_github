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
}