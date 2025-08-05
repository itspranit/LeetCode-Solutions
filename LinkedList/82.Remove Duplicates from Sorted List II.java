/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Create a dummy node before the head to handle edge cases easily
        // (e.g., when the first few nodes are duplicates)
        ListNode dummy = new ListNode(0, head);
        
        // 'prev' points to the last node that is confirmed unique
        ListNode prev = dummy;
        
        // Traverse the list
        while (head != null) {
            // If current node has a duplicate (next node with same value)
            if (head.next != null && head.val == head.next.val) {
                // Skip all nodes with this duplicate value
                while (head.next != null && head.val == head.next.val) {
                    head = head.next; // move to last duplicate node
                }
                // Link 'prev' to the node after the last duplicate
                prev.next = head.next;
            } else {
                // No duplicate → move 'prev' forward
                prev = prev.next;
            }
            // Move 'head' forward in all cases
            head = head.next;
        }
        
        // Return the modified list starting from dummy.next
        return dummy.next;
    }
}
