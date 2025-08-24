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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }
    public boolean dfs(TreeNode node,int targetsum){
        if(node==null){
            return false;
        }
        if(node.left==null && node.right==null){
            return targetsum==node.val;
        }
        boolean left=dfs(node.left,targetsum-node.val);
        boolean right=dfs(node.right,targetsum-node.val);

        return left||right;
    }
}
