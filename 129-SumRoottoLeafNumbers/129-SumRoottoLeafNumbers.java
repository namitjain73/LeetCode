// Last updated: 8/24/2025, 2:55:17 PM
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
    int ans= 0;
    public void helper(TreeNode root, String s){
        if(root == null) return;
        if(root.left == null && root.right == null){
            s = s + Integer.toString(root.val);
            System.out.println(s);
            ans = ans + Integer.parseInt(s);
        }


        helper(root.left , s += root.val);
        helper(root.right , s);

    }
    public int sumNumbers(TreeNode root) {
        ans = 0;
        helper(root,"");
        return ans;
    }
}