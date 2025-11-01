// Last updated: 01/11/2025, 11:00:22
class Solution {

    public int atMostK(int[] nums, int k){
        int n = nums.length;
        int cnt = 0;
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();

        while(j < n){
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);

            if(mp.size() > k){
                 while(mp.size() > k){
                    mp.put(nums[i], mp.getOrDefault(nums[i], 0) - 1);
                    if(mp.get(nums[i]) <= 0){
                        mp.remove(nums[i]);
                    }
                    i++;
                 }
            }

            // All subarrays ending at j with ≤ k distinct integers: (j - i + 1)
            if(mp.size() <= k) cnt += (j - i + 1);
            j++;
        }
        return cnt;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

}