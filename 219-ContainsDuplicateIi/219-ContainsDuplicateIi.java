// Last updated: 16/10/2025, 04:27:56
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i]) && (i- mp.get(nums[i])) <= k){
                return true;
            }
            else mp.put(nums[i],i);
        }
        return false;
    }
}