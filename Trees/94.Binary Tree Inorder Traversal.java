/**
 * Definition for a binary tree node.
 * This is the given class structure for a node in the binary tree.
 * Each node contains:
 * - val: the integer value stored in the node
 * - left: reference to the left child node
 * - right: reference to the right child node
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    // List to store the inorder traversal result
    List<Integer> ans = new ArrayList<>();

    // Main method to perform inorder traversal on a binary tree
    public List<Integer> inorderTraversal(TreeNode root) {
        dfs(root); // Call recursive helper function
        return ans; // Return the list containing the traversal order
    }

    // Recursive function to perform inorder DFS traversal
    public void dfs(TreeNode node) {
        if (node == null) { // Base case: if node is null, return
            return;
        }

        // 1. Traverse the left subtree
        dfs(node.left);

        // 2. Visit the current node
        ans.add(node.val); 

        // 3. Traverse the right subtree
        dfs(node.right); 
    }
}
