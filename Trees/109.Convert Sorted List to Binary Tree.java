/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;             // value stored in the node
 *     TreeNode left;       // pointer to the left child
 *     TreeNode right;      // pointer to the right child
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

/**
 * This class contains a method to convert a sorted linked list into
 * a height-balanced Binary Search Tree (BST).
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        // Base case: if the list is empty, return null
        if (head == null) {
            return null;
        }

        // Base case: if the list has only one element, return it as a TreeNode
        if (head.next == null) {
            return new TreeNode(head.val);
        }

        // Use slow & fast pointer technique to find the middle of the list
        // 'slow' will stop before the middle node
        ListNode slow = head;
        ListNode fast = head.next.next;

        // Move slow by 1 and fast by 2 steps until fast reaches the end
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // The middle node (slow.next) will be the root of this subtree
        TreeNode res = new TreeNode(slow.next.val);

        // Save the starting point of the right half
        ListNode righthalf = slow.next.next;

        // Disconnect the left half from the middle
        slow.next = null;

        // Recursively construct left subtree using the left half
        res.left = sortedListToBST(head);

        // Recursively construct right subtree using the right half
        res.right = sortedListToBST(righthalf);

        // Return the root node
        return res;
    }
}
