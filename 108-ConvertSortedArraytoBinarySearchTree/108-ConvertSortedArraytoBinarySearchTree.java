// Last updated: 8/7/2025, 11:26:29 AM
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

    public TreeNode helper(int[] arr , int si , int ei){
        if(si > ei) return null;

        int mid = (si+ei)/2;
        TreeNode nn = new TreeNode(arr[mid]);
        nn.left = helper(arr , si , mid-1);
        nn.right = helper(arr , mid+1 , ei);
        return nn;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums , 0 , nums.length-1);
        
    }
}