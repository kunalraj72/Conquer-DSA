// Last updated: 16/10/2025, 04:26:26
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> prefSum = new HashMap<>();
        prefSum.put(0,1); //this is because sum at this point is 0, and when sum == k then sum - k becomes 0 so if it is present in the map before hand, then only we can increase the count.

        for(int i=0;i<n;i++){
            sum += nums[i];
            if(prefSum.containsKey(sum - k)){
                count += prefSum.get(sum - k);
            }
            prefSum.put(sum,prefSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}