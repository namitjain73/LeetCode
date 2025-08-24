// Last updated: 8/24/2025, 1:55:28 PM
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
    public boolean helper(TreeNode root1 , TreeNode root2){
        if(root1 == null && root2 == null) return true;
        if(root1 == null || root2 == null) return false;
        if(root1.val != root2.val) return false;

        boolean l = helper(root1.left,root2.right);
        boolean r = helper(root1.right,root2.left);
        return l && r;



    }
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        return helper(root.left , root.right);

    }
}