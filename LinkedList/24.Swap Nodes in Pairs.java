class Solution {
    public ListNode swapPairs(ListNode head) {
        // If the list is empty or has only one node, no swapping is needed
        if (head == null || head.next == null) {
            return head;
        }

        // The new head of the list will be the second node after swapping
        ListNode newHead = head.next;

        // Pointers to help traverse and swap nodes
        ListNode previousNode = null;
        ListNode currentNode = head;

        while (currentNode != null && currentNode.next != null) {
            // Identify the two nodes to be swapped
            ListNode firstNode = currentNode;
            ListNode secondNode = currentNode.next;

            // Perform the swap
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // If this is not the first swap, connect the previous swapped pair to the current pair
            if (previousNode != null) {
                previousNode.next = secondNode;
            }

            // Update pointers to move ahead in the list
            previousNode = firstNode;
            currentNode = firstNode.next;
        }

        return newHead;
    }
}
