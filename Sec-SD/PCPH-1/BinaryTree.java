public class BinaryTree{

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    };
    TreeNode root;

    public void pre_Order(TreeNode root){
       if(root==null){
        return ;
       }
        System.out.print(root.val+" ");
        pre_Order(root.left);
        pre_Order(root.right);

    }
    
    public void in_Order(TreeNode root) {
        if (root == null) {
            return;
        }
        in_Order(root.left);
        System.out.print(root.val + " ");
        in_Order(root.right);

    } 
    public void post_Order(TreeNode root) {
        if (root == null) {
            return;
        }
        post_Order(root.left);
        post_Order(root.right);
        System.out.print(root.val + " ");
    }
   
}