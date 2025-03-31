class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        // We only need to check up to n - m * k
        for (int i = 0; i <= n - m * k; i++) {
            boolean found = true;
            for (int j = 1; j < k; j++) {
                // Compare the segment starting at i with the segment starting at i + j * m
                for (int l = 0; l < m; l++) {
                    if (arr[i + l] != arr[i + j * m + l]) {
                        found = false;
                        break; // Mismatch found
                    }
                }
                if (!found) {
                    break; // No need to check further if a mismatch is found
                }
            }
            if (found) {
                return true; // Found k patterns
            }
        }
        return false; // No pattern found
    }
}