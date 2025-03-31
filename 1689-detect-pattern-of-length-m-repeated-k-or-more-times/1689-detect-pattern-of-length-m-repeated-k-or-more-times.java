class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int count = 0;
        for (int i = 0; i <= arr.length - m * k; i++) { // Adjusted to prevent out-of-bounds
            count = 0; // Reset count for each starting position
            for (int j = 0; j < k; j++) {
                // Check if the next m elements match
                for (int l = 0; l < m; l++) {
                    if (arr[i + l] != arr[i + j * m + l]) {
                        count = 0; // Reset count if there's a mismatch
                        break; // Exit the inner loop on mismatch
                    }
                    if (l == m - 1) {
                        count++; // Increment count if a full match is found
                    }
                }
                if (count >= k) {
                    return true; // Return true if we found k patterns
                }
            }
        }
        return false; // Return false if no pattern is found
    }
}