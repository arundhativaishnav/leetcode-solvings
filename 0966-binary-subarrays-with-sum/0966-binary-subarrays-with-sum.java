class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalcount =0;
        int currsum=0;
        HashMap <Integer , Integer> freq = new HashMap<>();
            for(int num:nums){
                currsum += num;
                if(currsum == goal){
                    totalcount++;
                }
                if(freq.containsKey(currsum-goal)){
                    totalcount += freq.get(currsum -goal);
                }
                freq.put(currsum,freq.getOrDefault(currsum,0)+1);

            }
            return totalcount;
    }
}