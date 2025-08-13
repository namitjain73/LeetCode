// Last updated: 8/13/2025, 11:34:50 AM
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
    int camera = 0;
    public int minCamera(TreeNode root){
        if(root == null) return 0;
        int left = minCamera(root.left);
        int right = minCamera(root.right);

        if(left == -1 || right == -1){ //is node camers ki need hai
            camera++;
            return 1; // camera setupkiya hai
        }
        else if(left == 1 || right == 1){// inme se kisis ek ke pass camers hai so is node par jarurat nahi hai
        return 0;// iska mtlb mei coverd hu
        }
        else{ // aan mere pass camera nahi hai  so ujhe jarurat hai
            return -1;
        }


    }
    public int minCameraCover(TreeNode root) {
         int c = minCamera(root);
         if(c == -1) camera++;
         return camera;
    }
}