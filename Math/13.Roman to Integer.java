class Solution {
    // Method to convert a Roman numeral string to an integer
    public int romanToInt(String s) {
        int ans = 0, num = 0; // Initialize the result variable 'ans' and 'num' to store numeral values
        
        // Iterate over the string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            // Assign numerical values to Roman numeral characters
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            // If the current numeral is smaller than a previously added numeral, subtract it
            // This handles cases like IV (4) and IX (9) where subtraction is used
            if (4 * num < ans) 
                ans -= num;
            else 
                ans += num; // Otherwise, add the numeral's value to the result
        }

        return ans; // Return the final integer value
    }
}
