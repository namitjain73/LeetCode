// Last updated: 8/13/2025, 10:39:03 AM
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
    public TreeNode helper(int pl , int ph , int il , int ih , int[] pre , int[] in){
        if(pl > ph) return null;


        TreeNode root = new TreeNode(pre[pl]);
        int i = 0;
        while(in[i] != root.val){
            i++;
        }
        int leftsize = i - il;

        root.left = helper(pl+1,pl+leftsize,il,i-1,pre,in);
        root.right = helper(pl+leftsize+1,ph,i+1,ih,pre,in);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(0,n-1, 0 , n-1,preorder,inorder);
    }
}