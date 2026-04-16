public class IsBalanced {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    };
    
    public boolean isBalanced(TreeNode root) {
        return balanced(root);
    }

    public boolean balanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean lb = balanced(root.left);// left balanced
        boolean rb = balanced(root.right);// right balanced

        boolean sb = Math.abs(ht(root.left) - ht(root.right)) <= 1;// self balanced
        return lb && rb && sb;

    }

    public int ht(TreeNode root) {
        if (root == null) {
            return -1;
        }
        int lh = ht(root.left);
        int rh = ht(root.right);
        return Math.max(lh, rh) + 1;
    }
}