class Solution {
    public String reverseWords(String s) {
    
        int lastSpaceIndex =-1;
        char[] chArray = s.toCharArray();
        int len = s.length();
        for(int startIndex =0;startIndex <= len;startIndex++){
            if(startIndex == len || chArray[startIndex]== ' '){
                int strIndex = lastSpaceIndex +1;
                int endIndex = startIndex -1;

                while(strIndex < endIndex ){
                    char temp = chArray[strIndex];
                    chArray[strIndex] = chArray[endIndex];
                    chArray[endIndex] = temp ;
                    strIndex++;
                    endIndex--;
                }
                lastSpaceIndex = startIndex;
            }
            
        }
        return new String(chArray);
        
        
    }
}