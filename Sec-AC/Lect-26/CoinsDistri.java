public class CoinsDistri {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

       TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }

    int ans=0;
    public int distributeCoins(TreeNode root) {
        
        cnt(root);
        return ans;
    }
    public int cnt(TreeNode root){

        if(root==null){
            return 0;
        }
        int lc=cnt(root.left);
        int rc=cnt(root.right);
        ans+=Math.abs(lc)+Math.abs(rc);
        return lc+rc+root.val-1;
    }
}