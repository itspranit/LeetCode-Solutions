class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Edge case: If the list is empty, return as is
        if (head == null) return head;

        ListNode main = head;  // Pointer to traverse the list
        ListNode justback = head;  // Pointer to keep track of the node before the new head
        ListNode last = head;  // Pointer to find the last node in the list

        int count = 1; // Counter to determine the length of the list

        // Find the length of the linked list
        while (last.next != null) {
            count++;
            last = last.next;
        }

        // If the list has only one element or no rotation is needed, return as is
        if (count > 1 && k == 0 || count == k) return head;

        // Compute the effective number of rotations needed
        int pos = count - k % count;

        // Connect the last node to the head, making it a circular linked list
        last.next = head;

        count = 1;
        
        // Traverse to the new breaking point of the list
        while (main.next != null && count <= pos) {
            justback = main;  // Keep track of the node before the new head
            main = main.next;
            count++;
        }

        // Break the loop to form the new list
        justback.next = null;

        // Return the new head of the rotated list
        return main;
    }
}
