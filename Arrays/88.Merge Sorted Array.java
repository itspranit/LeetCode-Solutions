class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // i -> pointer for nums1 (first m elements)
        // j -> pointer for nums2
        // k -> pointer for merged array
        int i = 0, j = 0, k = 0;

        // Temporary array to store the merged result
        int[] arr = new int[m + n];

        // Merge elements from nums1 and nums2 in sorted order
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1 (if any)
        while (i < m) {
            arr[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            arr[k++] = nums2[j++];
        }

        // Copy merged result back to nums1
        for (int p = 0; p < m + n; p++) {
            nums1[p] = arr[p];
        }
    }
}
