Here's your README.md formatted exactly like your requested style:

🟢 Add Two Numbers (Medium)

🔹 Problem Statement  

Given two non-empty linked lists representing two non-negative integers, where the digits are stored in **reverse order**, add the two numbers and return the sum as a linked list. Each node contains a **single digit**, and there are no leading zeros except for the number 0 itself.  

Example:  

**Input:**  
l1 = [2 → 4 → 3], l2 = [5 → 6 → 4]

**Output:**  
[7 → 0 → 8]

**Explanation:**  
342 + 465 = 807


---

🔹 Approach 1: Iterative (O(max(N, M))) ✅  

- Use a **dummy node** to simplify result list construction.  
- Use a **carry variable** to handle sums greater than `9`.  
- Traverse both lists, adding corresponding digits.  
- If one list is shorter, treat missing values as `0`.  
- Store the last digit of the sum in a new node (`sum % 10`).  
- If there’s a leftover carry, add an extra node.  

**Time Complexity:** `O(max(N, M))`  
**Space Complexity:** `O(max(N, M))`  

---

🔹 Edge Cases Considered  

✅ Lists of different lengths (e.g., `9 → 9` and `1` should return `0 → 0 → 1`)  
✅ Carry-over when sum exceeds `9`  
✅ Single-node lists (e.g., `5 + 5` should return `0 → 1`)  
✅ One empty list (e.g., `[] + [3 → 4 → 5]` should return `[3 → 4 → 5]`)  

---

🔹 Java Code  

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return dummy.next;
    }
}

🔹 Related Problems

🔹 LeetCode 445: Add Two Numbers II (digits stored in forward order)
🔹 LeetCode 21: Merge Two Sorted Lists (similar linked list manipulation)
