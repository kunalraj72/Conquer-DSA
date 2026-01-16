// Last updated: 17/01/2026, 01:58:16
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n = nums.length;
4        HashMap<Integer, Integer> mp = new HashMap<>();
5        int []ans = new int[2];
6        for(int i = 0; i < n; i++){
7            int b = target - nums[i];
8            if(mp.containsKey(b)){
9                ans[0] = i;
10                ans[1] = mp.get(b);
11            }
12            mp.put(nums[i], i);
13        }
14        return ans;
15    }
16}