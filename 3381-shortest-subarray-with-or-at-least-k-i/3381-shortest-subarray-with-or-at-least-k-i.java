class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;

        for (int left = 0; left < n; left++) {
            int currentOR = 0;
            for (int right = left; right < n; right++) {
                currentOR |= nums[right];
                if (currentOR >= k) {
                    minLength = Math.min(minLength, right - left + 1);
                    break; // No need to extend further from this left
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
