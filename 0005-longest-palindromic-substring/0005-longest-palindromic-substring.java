class Solution {
    public String longestPalindrome(String s) {
       int n = s.length();
       for(int length = n ;length>0;length--){
            for(int start =0; start <= n -length ; start ++){
                if(check(start , start + length , s)){
                    return s.substring(start , start+length);
                }
            }

       }
       return "";

    }
    private boolean check(int i , int j , String s){
        int left =i;
        int right = j-1;

        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}