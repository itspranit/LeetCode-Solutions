/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;              // Value of the current node
 *     TreeNode left;        // Pointer to the left child
 *     TreeNode right;       // Pointer to the right child
 *     TreeNode() {}         // Default constructor
 *     TreeNode(int val) {   // Constructor for value-only node
 *         this.val = val;
 *     }
 *     TreeNode(int val, TreeNode left, TreeNode right) { // Constructor with value and children
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Final result list to store zigzag level order traversal
        List<List<Integer>> ans = new ArrayList<>();
        
        // Edge case: if the tree is empty, return an empty list
        if (root == null) return ans;

        // Queue for BFS traversal
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        // Flag to track the direction of traversal
        // true → left to right, false → right to left
        boolean j = true;

        // Loop until all nodes are processed
        while (!que.isEmpty()) {
            int size = que.size(); // Number of nodes in the current level
            List<Integer> list = new ArrayList<>(); // Stores values of the current level
            
            // Process all nodes at the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = que.remove(); // Remove from queue
                
                // If traversing left to right, add normally
                if (j) {
                    list.add(node.val);
                }
                // If traversing right to left, insert at the front
                else {
                    list.add(0, node.val);
                }

                // Add left child to the queue if it exists
                if (node.left != null) {
                    que.add(node.left);
                }
                // Add right child to the queue if it exists
                if (node.right != null) {
                    que.add(node.right);
                }
            }
           
            // Add the current level's values to the final answer
            ans.add(list);
            
            // Flip traversal direction for the next level
            j = !j;
        }
        
        // Return the zigzag level order traversal
        return ans;
    }
}
