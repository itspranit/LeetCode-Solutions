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
    public int minDepth(TreeNode root) {
        
        if (root == null) {
            return 0; 
        }
        return dfs(root, 0);
    }

    int dfs(TreeNode node, int length) {
        if (node == null) {
            return Integer.MAX_VALUE; 
        }
        
        if (node.left == null && node.right == null) {
            return length + 1;
        }
        
        int left = dfs(node.left, length + 1);
        int right = dfs(node.right, length + 1);
        return Math.min(left, right); 
    }
}
