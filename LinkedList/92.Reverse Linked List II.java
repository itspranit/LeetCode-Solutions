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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
        dummy.next = head;
        ListNode prev = dummy;

        // Step 1: Move `prev` to the node just before the `left` position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        // `start` is the first node of the sublist to be reversed
        ListNode start = prev.next;
        // `then` is the node that will be moved to the front of the sublist
        ListNode then = start.next;

        // Step 2: Reverse the sublist from `left` to `right`
        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }

        return dummy.next;
    }
}
