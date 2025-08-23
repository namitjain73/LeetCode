// Last updated: 8/23/2025, 3:41:04 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        // if(root.left == null && root.right == null) return true;
        return valid(root).isbst;
    }
    public Pair valid(TreeNode root){
        if(root == null) return new Pair();

        Pair lbp = valid(root.left);
        Pair rbp = valid(root.right);
        Pair sbp = new Pair();
        sbp.min = Math.min(lbp.min , Math.min(rbp.min , root.val));
        sbp.max = Math.max(lbp.max , Math.max(rbp.max , root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
        return sbp;

    }
    class Pair{
        boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

    }
}