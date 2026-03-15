// Last updated: 16/03/2026, 01:24:02
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int n = nums.length;
4        int count = 0;
5        int sum = 0;
6        HashMap<Integer, Integer> prefSum = new HashMap<>();
7        prefSum.put(0,1); //this is because sum at this point is 0, and when sum == k then sum - k becomes 0 so if it is present in the map before hand, then only we can increase the count.
8
9        for(int i=0;i<n;i++){
10            sum += nums[i];
11            if(prefSum.containsKey(sum - k)){
12                count += prefSum.get(sum - k);
13            }
14            prefSum.put(sum,prefSum.getOrDefault(sum, 0) + 1);
15        }
16        return count;
17    }
18}