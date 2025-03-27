class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() < 2) return true;
        
        if (Character.isUpperCase(word.charAt(0))) {
            // Check if all characters after the first are either all uppercase or all lowercase
            boolean allUpper = true;
            boolean allLower = true;
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    allLower = false; // Found an uppercase letter after the first
                } else {
                    allUpper = false; // Found a lowercase letter after the first
                }
            }
            return allUpper || allLower; // Return true if all are upper or all are lower
        } else {
            // If the first letter is lowercase, all must be lowercase
            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false; // Found an uppercase letter after the first
                }
            }
            return true; // All letters are lowercase
        }
    }
}