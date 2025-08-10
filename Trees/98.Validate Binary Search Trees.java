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
    public boolean isValidBST(TreeNode root) {
        // Start the recursive check with the full range of possible values
        // Using Long.MIN_VALUE and Long.MAX_VALUE to avoid integer overflow issues
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode node, long min, long max) {
        // Base case: An empty tree is a valid BST
        if (node == null) return true;

        // If the current node's value violates the min/max constraint, it's not a BST
        if (node.val <= min || node.val >= max) return false;

        // Recursively check:
        // 1. Left subtree: values must be < current node's value
        // 2. Right subtree: values must be > current node's value
        return isValid(node.left, min, node.val) && 
               isValid(node.right, node.val, max);
    }
}

