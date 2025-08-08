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
    public ListNode partition(ListNode head, int x) {
        // Create dummy nodes for two separate lists:
        // one for nodes with values less than x,
        // and one for nodes with values greater than or equal to x
        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);

        // These pointers will be used to build the new lists
        ListNode lowerhead = less;
        ListNode greaterhead = greater;

        // Traverse the original list
        ListNode main = head;
        while (main != null) {
            if (main.val < x) {
                // Append current node to 'less than x' list
                lowerhead.next = main;
                lowerhead = lowerhead.next;
            } else {
                // Append current node to 'greater than or equal to x' list
                greaterhead.next = main;
                greaterhead = greaterhead.next;
            }
            main = main.next;
        }

        // Important: Terminate the 'greater' list to avoid cycle or garbage links
        greaterhead.next = null;

        // Connect the two partitions
        lowerhead.next = greater.next;

        // Return the head of the new rearranged list
        return less.next;
    }
}
