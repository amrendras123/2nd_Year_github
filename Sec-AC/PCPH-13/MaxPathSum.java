public class MaxPathSum {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    };
    public int maxPathSum(TreeNode root) {
        int[] arr = new int[1];
        arr[0] = Integer.MIN_VALUE;
        maxpath(root, arr);
        return arr[0];
    }

    public int maxpath(TreeNode root, int[] arr) {
        if (root == null) {
            return 0;
        }
        int lmax = Math.max(0, maxpath(root.left, arr));
        int rmax = Math.max(0, maxpath(root.right, arr));
        arr[0] = Math.max(arr[0], lmax + rmax + root.val);
        return Math.max(lmax, rmax) + root.val;
    }
}
