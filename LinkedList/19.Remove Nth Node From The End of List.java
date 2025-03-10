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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        
        // Move fast pointer 'n' steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        
        // If fast reaches null, it means we need to remove the head node
        if (fast == null) {
            return head.next;
        }
        
        // Move both pointers one step at a time until fast reaches the last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Remove the nth node from the end
        slow.next = slow.next.next;
        
        return head;
    }
}
