class Solution {
    public int reversePairs(int[] nums) {
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }

    private int mergeSortAndCount(int[] nums, int start, int end) {
        if (start >= end) return 0;

        int mid = (start + end) / 2;
        int count = mergeSortAndCount(nums, start, mid) + mergeSortAndCount(nums, mid + 1, end);
        count += countReversePairs(nums, start, mid, end);
        merge(nums, start, mid, end);
        return count;
    }

    private int countReversePairs(int[] nums, int start, int mid, int end) {
        int count = 0;
        int j = mid + 1;

        for (int i = start; i <= mid; i++) {
            while (j <= end && nums[i] > 2L * nums[j]) {
                j++;
            }
            count += j - (mid + 1);
        }
        return count;
    }

    private void merge(int[] nums, int start, int mid, int end) {
        int[] left = Arrays.copyOfRange(nums, start, mid + 1);
        int[] right = Arrays.copyOfRange(nums, mid + 1, end + 1);
        int i = 0, j = 0, k = start;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }

        while (i < left.length) {
            nums[k++] = left[i++];
        }

        while (j < right.length) {
            nums[k++] = right[j++];
        }
    }
}