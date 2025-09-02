class Solution {
    public int findDuplicate(int[] nums) {
      int duplicate =-1;
      int n = nums.length;
      for(int i =0;i<n;i++){
        if(nums[Math.abs(nums[i])-1] < 0){
            duplicate = Math.abs(nums[i]);
        }else{
            nums[Math.abs(nums[i])-1] *= (-1);
        }
      }
      return duplicate;
    }
}