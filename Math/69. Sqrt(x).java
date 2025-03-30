class Solution {
    public int mySqrt(int x) {
        // Base cases: If x is 0 or 1, return x itself
        if (x == 0 || x == 1)
            return x;

        int start = 1; // Start of the search range
        int end = x;   // End of the search range
        int mid = -1;  // Variable to store the middle value

        // Binary search to find the square root
        while (start <= end) {
            mid = start + (end - start) / 2; // Avoids overflow

            // If mid * mid is greater than x, move the search to the left half
            if ((long) mid * mid > (long) x)
                end = mid - 1;
            // If mid * mid equals x, return mid (perfect square root found)
            else if (mid * mid == x)
                return mid;
            // Otherwise, move the search to the right half
            else
                start = mid + 1;
        }

        // If exact square root is not found, return the floor value (end)
        return end;
    }
}
