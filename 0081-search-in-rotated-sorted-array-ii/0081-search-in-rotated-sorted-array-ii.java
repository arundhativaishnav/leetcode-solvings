class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return true; // Target found
            }

            // Handle duplicates: skip identical elements
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            }
            // Left part is sorted
            else if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1; // Search in the left part
                } else {
                    low = mid + 1; // Search in the right part
                }
            }
            // Right part is sorted
            else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1; // Search in the right part
                } else {
                    high = mid - 1; // Search in the left part
                }
            }
        }
        return false; // Target not found
    }
}