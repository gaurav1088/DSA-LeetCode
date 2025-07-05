class Solution {

    // Function to find the median of two sorted arrays
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge both arrays into a single sorted array
        int[] ans = merge(nums1, nums2);

        // If length is even, median is average of two middle elements
        if (ans.length % 2 == 0) {
            double ans2 = (double) (ans[ans.length / 2] + ans[ans.length / 2 - 1]) / 2;
            return ans2;
        } else {
            // If length is odd, median is the middle element
            double ans2 = (double) (ans[ans.length / 2]);
            return ans2;
        }
    }

    // Function to merge two sorted arrays
    public int[] merge(int[] arr1, int[] arr2) {
        // Resultant merged array
        int[] ans = new int[arr1.length + arr2.length];

        // Pointers for arr1, arr2, and ans
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        // Continue while there are elements in either array
        while (p1 < arr1.length || p2 < arr2.length) {
            int val1 = 0;
            int val2 = 0;

            // Assign value from arr1 or set to MAX if p1 is out of bounds
            if (p1 < arr1.length) {
                val1 = arr1[p1];
            } else {
                val1 = Integer.MAX_VALUE;
            }

            // Equivalent ternary version (commented out)
            // int val1 = (p1 < arr1.length) ? arr1[p1] : Integer.MAX_VALUE;

            // Assign value from arr2 or set to MAX if p2 is out of bounds
            if (p2 < arr2.length) {
                val2 = arr2[p2];
            } else {
                val2 = Integer.MAX_VALUE;
            }

            // Equivalent ternary version (commented out)
            // int val2 = (p2 < arr2.length) ? arr2[p2] : Integer.MAX_VALUE;

            // Compare and insert smaller value to merged array
            if (val1 < val2) {
                ans[p3] = val1;
                p1++; // Move pointer in arr1
            } else {
                ans[p3] = val2;
                p2++; // Move pointer in arr2
            }

            p3++; // Move pointer in ans array
        }

        return ans; // Return the final merged array
    }
}
