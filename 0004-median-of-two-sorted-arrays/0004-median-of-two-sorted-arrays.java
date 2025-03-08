import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] mergearr = new int[m + n];

        // Manually copy elements from nums1 and nums2 into mergearr
        System.arraycopy(nums1, 0, mergearr, 0, m);
        System.arraycopy(nums2, 0, mergearr, m, n);

        // Sort the merged array
        Arrays.sort(mergearr);
        
        // Calculate the median
        double median;
        if ((m + n) % 2 == 0) { // Even length
            median = (mergearr[(m + n) / 2 - 1] + mergearr[(m + n) / 2]) / 2.0;
        } else { // Odd length
            median = mergearr[(m + n) / 2];
        }
        
        return median;
    }
}