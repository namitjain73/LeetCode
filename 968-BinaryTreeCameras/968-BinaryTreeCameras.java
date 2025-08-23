// Last updated: 8/23/2025, 5:04:56 PM
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
    int cam = 0;
    public int minCameraCover(TreeNode root) {
        cam= 0;
        if(-1 == camera(root)){
            cam++;
        }
        return cam;
    }
    public int camera(TreeNode root){
        if(root == null) return 0;
        

        int left = camera(root.left);
        int right = camera(root.right);

        if(left == -1 || right == -1){
            cam++;
            return 1;
        }
        else if(left == 1 || right == 1){
            return 0;
        }
        else{
            return -1;
        }
    }
}