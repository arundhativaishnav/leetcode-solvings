class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low =0;
        int high =0 ;
        int minLenWindow = Integer.MAX_VALUE;
        int currSum=0;

        while(high < nums.length){
            currSum += nums[high];
            high++;
            
            while(currSum >= target ){
                int currWindow = high-low;
                minLenWindow = Math.min(currWindow ,minLenWindow );

                currSum -= nums[low];
                low++;
            }
        }
        return minLenWindow == Integer.MAX_VALUE ? 0: minLenWindow;


        
    }
}