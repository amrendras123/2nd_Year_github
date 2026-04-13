import java.util.Scanner;

public class BinaryTree {
    
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    };
    Scanner sc=new Scanner(System.in);
    private TreeNode root;
    public void createTree(){
       this.root=ct();
    }
    public TreeNode ct(){
       TreeNode nn=new TreeNode();
       nn.val=sc.nextInt();
       boolean hlc=sc.nextBoolean();
       if(hlc){
        nn.left=ct();
       }
       boolean hrc=sc.nextBoolean();
       if(hrc){
        nn.right=ct();
       }
       return nn;
    }
    public void display(){
        display(root);
    }
    private void display(TreeNode root){
        if(root==null){
            return ;
        }
        String s="";
        s=s+root.val;
        s="<-"+s+"->";
        if(root.left!=null){
            s=root.left.val+s;
        }else{
            s="."+s;
        }
        if(root.right!=null){
            s=s+root.right.val;
        }else{
            s=s+".";
        }
        System.out.println(s);
        display(root.left);
        display(root.right);
    }
    //pre_Order
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(TreeNode root){
        if(root==null){
            return ;
        }
        System.out.print(root.val+"->");
        preOrder(root.left);
        preOrder(root.right);
    }
    //in_Order
    public void inOrder() {
        inOrder(root);
    }
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "->");
        inOrder(root.right);
    }
    //post_Order
    public void postOrder() {
        postOrder(root);
    }
    private void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + "->");
    }
    public int maxDept(){
        return maxDepth(root);
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return Math.max(lh, rh) + 1;
    }
    public int cntNode(){
        return cntNode(root);
    }
    private int cntNode(TreeNode root){

        if(root==null){
            return 0;
        }
        int lc=cntNode(root.left);
        int rc=cntNode(root.right);
        return lc+rc+1;
    }
    public int max(){
        return max(root);
    }
    private int max(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int lmax=max(root.left);
        int rmax=max(root.right);
        return Math.max(lmax,Math.max(rmax,root.val));
    }
    
    public int min() {
        return min(root);
    }
    private int min(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int lmax = min(root.left);
        int rmax = min(root.right);
        return Math.min(lmax, Math.min(rmax, root.val));
    }
    public boolean find(int tar){
        return find(root,tar);
    }
    public boolean find(TreeNode root,int tar){
        if(root==null){
            return false;
        }
        if(root.val==tar){
            return true;
        }
        boolean lf=find(root.left,tar);
        boolean rf=find(root.right,tar);

        return lf|rf;
    }


}
