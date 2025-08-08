// Last updated: 8/8/2025, 11:18:38 AM
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

    public BstPair ValidBST(TreeNode root){
        if(root == null) return new BstPair();
        BstPair lbp = ValidBST(root.left);
        BstPair rbp = ValidBST(root.right);
        BstPair sbp = new BstPair();
        sbp.min = Math.min(lbp.min , Math.min(rbp.min , root.val));
        sbp.max = Math.max(lbp.max, Math.max(rbp.max , root.val));
        sbp.isbst = lbp.isbst && rbp.isbst && root.val > lbp.max && root.val < rbp.min;
        return sbp;
    }
    public boolean isValidBST(TreeNode root) {
        return ValidBST(root).isbst;
    }



    class BstPair{
        boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
    }
}