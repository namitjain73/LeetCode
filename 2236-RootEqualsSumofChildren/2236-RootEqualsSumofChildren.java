// Last updated: 8/28/2025, 1:57:40 PM
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
    public boolean checkTree(TreeNode root) {
        return helper(root);
    }
    public static boolean helper(TreeNode root){
	    if(root == null || (root.left == null && root.right == null)) return true;
	    
	    boolean left = helper(root.left);
	    boolean right = helper(root.right);
	    
	    int i = root.left != null ? root.left.val : 0;
	    int j = root.right != null ? root.right.val : 0;
	    
	    return (root.val == i + j) && left && right;
	}
}