// Last updated: 16/10/2025, 04:25:33
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int count = 0;
        HashMap<Integer, Integer> prefSum = new HashMap<>(2);
        int sum = 0;
        prefSum.put(0, 1);
        for(int i = 0; i < n; i++){
            sum += nums[i];
            // if(sum == goal){ // remSum = 0, for this case we already put (0,1) in map
            //     count++;
            // }
            int remSum = sum - goal;
            if(prefSum.containsKey(remSum)){
                count += prefSum.get(remSum);
            }
            prefSum.put(sum, prefSum.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}