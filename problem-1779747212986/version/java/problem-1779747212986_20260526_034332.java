// Last updated: 26/05/2026, 03:43:32
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        int n = nums.length;
4        HashMap<Integer, Integer> mp = new HashMap<>();
5        int cur = 0;
6        int max = 0;
7        for(int i = 0; i < n; i++){
8           mp.put(nums[i], mp.getOrDefault(nums[i], 0) + 1);
9        }
10        int i = 0;
11        for(int num : mp.keySet()){
12            if(!mp.containsKey(num - 1)){
13                cur = 1;
14                while(mp.containsKey(num + 1)){
15                    num++;
16                    cur++;
17                }
18            }
19            max = Math.max(cur, max);
20        }
21        return max;
22    }
23}