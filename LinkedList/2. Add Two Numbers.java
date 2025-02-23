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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to simplify result list construction
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;  // Pointer to build the result list
        int carry = 0;  // Stores carry-over value for addition
        
        // Traverse both lists until both are exhausted and no carry remains
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;  // Start with carry from the previous step
            
            // Add value from l1 if available, then move to the next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            
            // Add value from l2 if available, then move to the next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            // Compute new carry and the digit to store in the result list
            carry = sum / 10;
            current.next = new ListNode(sum % 10);  // Create a new node with the sum's last digit
            current = current.next;  // Move pointer forward
        }
        
        // Return the next of dummy node as the head of the result list
        return dummy.next;
    }
}
