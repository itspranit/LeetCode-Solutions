class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length; // Length of first array
        int len2 = arr2.length; // Length of second array
        int mergedLength = len1 + len2; // Total length of merged array
        int[] mergedArray = new int[mergedLength]; // Array to store merged values

        int index1 = 0, index2 = 0, mergeIndex = 0;

        // Merge two sorted arrays into mergedArray
        while (index1 < len1 && index2 < len2) {
            if (arr1[index1] < arr2[index2]) {
                mergedArray[mergeIndex++] = arr1[index1++];
            } else {
                mergedArray[mergeIndex++] = arr2[index2++];
            }
        }

        // If elements are left in arr1, add them to mergedArray
        while (index1 < len1) {
            mergedArray[mergeIndex++] = arr1[index1++];
        }

        // If elements are left in arr2, add them to mergedArray
        while (index2 < len2) {
            mergedArray[mergeIndex++] = arr2[index2++];
        }

        // Compute median of mergedArray
        if (mergedLength % 2 == 0) { // If even length, median is average of two middle elements
            return ((double) mergedArray[mergedLength / 2 - 1] + (double) mergedArray[mergedLength / 2]) / 2;
        } else { // If odd length, median is the middle element
            return (double) mergedArray[mergedLength / 2];
        }
    }
}
