// Last updated: 8/23/2025, 3:25:17 PM
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
    public int maxSumBST(TreeNode root) {
        return valid(root).ans;
    }


    public Pair valid(TreeNode root){
        if(root == null) return new Pair();


        Pair lbp = valid(root.left);
        Pair rbp = valid(root.right);
        Pair sbp = new Pair();
        sbp.min = Math.min(lbp.min , Math.min(rbp.min,root.val));
        sbp.max = Math.max(lbp.max , Math.max(rbp.max,root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && lbp.max < root.val && rbp.min > root.val;
        sbp.sum = rbp.sum + lbp.sum + root.val;
        if(sbp.isbst){
            sbp.ans = Math.max(lbp.ans , Math.max(rbp.ans , sbp.sum));
        }else{
            sbp.ans = Math.max(lbp.ans , rbp.ans);
        }
        return sbp;
    }
    class Pair{
        boolean isbst = true;
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;
        int ans=  0;
        int sum = 0;

    }
}