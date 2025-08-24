// Last updated: 8/24/2025, 3:29:13 PM
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
    List<Integer> list;
    int max_level = 0;
    public void helper(TreeNode root , int curr_level){
        if(root == null) return;

        if(max_level < curr_level){
            list.add(root.val);
            max_level = curr_level;
        }

        helper(root.right,curr_level+1);
        helper(root.left,curr_level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        list =new ArrayList<>();
        helper(root,1);
        return list;
    }
}