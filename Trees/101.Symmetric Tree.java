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
    // Main function to check if a tree is symmetric
    public boolean isSymmetric(TreeNode root) {
        // Compare left and right subtrees of the root
        return compare(root.right, root.left);
    }

    // Helper function to compare two subtrees for mirror symmetry
    boolean compare(TreeNode p, TreeNode q) {
        // If both nodes are null, they are symmetric
        if(p == null && q == null) {
            return true;
        }
        // If one is null or values differ, not symmetric
        if(p == null || q == null || p.val != q.val) {
            return false;
        }
        // Recursively compare outer and inner pairs
        return compare(p.right, q.left) && compare(p.left, q.right);
    }
}
