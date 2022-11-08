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
    private boolean result=true;
    public boolean isBalanced(TreeNode root) {
        validate(root);
        return result;
    }
    public int validate(TreeNode root){
        if(root==null)
            return 0;
        int left=validate(root.left);
        int right=validate(root.right);
        if(Math.abs(left-right)>1)
            result=false;
        return 1+ Math.max(left,right);
    }
}