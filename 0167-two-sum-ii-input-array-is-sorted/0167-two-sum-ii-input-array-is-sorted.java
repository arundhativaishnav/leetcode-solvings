class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left =0;
        int right = numbers.length -1;
        while(left < right){
            int total = numbers[left] + numbers[right];
            if(total==target){
                res[0] = left + 1;
                res[1] = right +1;
                return res;
            }else if(total < target){
                left ++;
            }else{
                right --;
            }
            
        }
        return res; // Return an empty array if no solution is found
    }
}