class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] product_left = new int[nums.length];
        product_left[0] = 1;

        int product_right = 1;

        for(int index = 1; index<nums.length; index++){
            product_left[index] = product_left[index-1]*nums[index-1];
        }

        for(int index = nums.length-1;index>=0;index--){
            product_left[index] = product_left[index]*product_right;
            product_right *= nums[index]; 
        }
        return product_left;
    }
}