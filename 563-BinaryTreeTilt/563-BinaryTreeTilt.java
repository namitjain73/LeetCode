// Last updated: 8/13/2025, 12:29:27 AM
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
    int n ;
    public int helper(TreeNode root , int[] arr){
        if(root == null){
            return 0;
        }


        int left = helper(root.left,arr);
        int right = helper(root.right,arr);
        arr[0] += Math.abs(left - right);
        return root.val + left + right;
    }

    public int findTilt(TreeNode root) {
        n = 0;
        int[] arr = new int[1];
        helper(root,arr);
        return arr[0];  
    }
}