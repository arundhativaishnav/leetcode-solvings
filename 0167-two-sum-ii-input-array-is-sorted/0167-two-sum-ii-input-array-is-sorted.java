class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        for (int slow = 0; slow < numbers.length; slow++) {
            for (int fast = slow + 1; fast < numbers.length; fast++) {
                if (numbers[slow] + numbers[fast] == target) {
                    res[0] = slow + 1; // Store the index (1-based)
                    res[1] = fast + 1; // Store the index (1-based)
                    return res; // Return the result immediately
                }
            }
        }
        return res; // Return an empty array if no solution is found
    }
}