class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n= nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] seen = new boolean[n+1];

        for(int num : nums){
            if(num>0 && num<=n){
                seen[num] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!seen[i]){
                res.add(i);
            }
        }
        return res;
    }
}