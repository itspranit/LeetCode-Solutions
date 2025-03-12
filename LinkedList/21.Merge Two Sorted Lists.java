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
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the starting point of the merged list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy; // Pointer to track the current position in the merged list
        
        ListNode h1 = list1; // Pointer to traverse the first linked list
        ListNode h2 = list2; // Pointer to traverse the second linked list

        // Merge both lists by choosing the smaller value at each step
        while (h1 != null && h2 != null) {
            if (h1.val <= h2.val) {
                curr.next = h1; // Append h1 node to merged list
                h1 = h1.next; // Move to the next node in list1
            } else {
                curr.next = h2; // Append h2 node to merged list
                h2 = h2.next; // Move to the next node in list2
            }
            curr = curr.next; // Move the merged list pointer forward
        }

        // If there are remaining nodes in list1, append them
        while (h1 != null) {
            curr.next = h1;
            h1 = h1.next;
            curr = curr.next;
        }

        // If there are remaining nodes in list2, append them
        while (h2 != null) {
            curr.next = h2;
            h2 = h2.next;
            curr = curr.next;
        }

        // Return the merged list, skipping the dummy node
        return dummy.next;
    }
}
