class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicate =-1;
        int missing = -1 ;
        int[] res = new int[2];
        
        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])-1 <n){
                    if(nums[Math.abs(nums[i])-1]<0){
                    duplicate = Math.abs(nums[i]);
                }else{
                    nums[Math.abs(nums[i])-1] *=(-1);
                }
            }
           
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                missing = i+1;
            }
        }
        res[0] = duplicate;
        res[1] = missing;
        return res;

    }
}