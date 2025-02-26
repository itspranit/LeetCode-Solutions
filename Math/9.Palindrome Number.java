class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes (e.g., -121 is not the same as 121-)
        if (x < 0) {
            return false;
        }

        int rev = 0;  // Variable to store the reversed number
        int temp = x; // Copy of the original number to avoid modifying x

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;  // Extract the last digit
            temp /= 10;             // Remove the last digit
            rev = rev * 10 + digit; // Append the digit to the reversed number
        }

        // If the reversed number is equal to the original, it's a palindrome
        return rev == x;
    }
}
