class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {
            
            // If the current digit is less than 9, simply increment it and return the array
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
          
            // If the digit is 9, set it to 0 and continue to the previous digit
            digits[i] = 0;
        }
        
        // If all digits were 9, we need an extra digit at the beginning (e.g., 999 -> 1000)
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The first digit becomes 1, and the rest remain 0 by default
        
        return newDigits;
    }
}
