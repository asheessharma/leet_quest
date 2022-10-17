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
    public List<Integer> postorderTraversal(TreeNode root) {
        /*List<Integer> list=new ArrayList<>();
        helper(root,list);
        return list;
    }
    private void helper(TreeNode node, List<Integer> list){
    if(node==null){
        return;
    }
    helper(node.left,list);
    helper(node.right,list);
    list.add(node.val);
  }*/
   LinkedList<Integer> list=new LinkedList<>();
    Stack<TreeNode> st=new Stack<>();
        if(root==null){
            return list;
        }
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr=st.pop();
            list.addFirst(curr.val);
            if(curr.left!=null){
                st.push(curr.left);
            }
            if(curr.right!=null){
                st.push(curr.right);
            }
        }
        
        return list;      
    }
}