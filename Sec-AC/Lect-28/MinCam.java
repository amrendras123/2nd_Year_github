
public class MinCam {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }

       int min=0;
    public int minCameraCover(TreeNode root) {
       if(minc(root)==-1){
        min++;
       }
       return min;
    }
    public int minc(TreeNode root){
        if(root==null){
            return 1;
        }
        int l=minc(root.left);
        int r=minc(root.right);
        if(l==-1||r==-1){
             min++;
             return 0;
        }
        if(l==0||r==0){
            return 1;
        }
        return -1;
    }
}