// Last updated: 06/02/2026, 03:42:12
1class Solution {
2
3    public int countAtMost(int[] nums, int goal){
4        int n = nums.length;
5        int cnt = 0;
6        int i = 0;
7        int j = 0;
8        int sum = 0;
9
10        if (goal < 0) return 0;
11
12        while(j < n){
13            sum += nums[j];
14
15            if(sum > goal){
16                while(sum > goal){
17                    sum -= nums[i];
18                    i++;
19                }
20            }
21            // we r counting subarray with sum <= goal becoz 
22            // Count(subarrays with sum == goal) = Count(subarrays with sum ≤ goal) − 
23            // Count(subarrays with sum ≤ goal − 1)
24            if(sum <= goal){
25                //counting all the subarrays which are ending at j and starting anywhere
26                //between [i, j].
27                cnt += j - i + 1;
28            }
29            j++;
30        }
31        return cnt;
32    }
33
34    public int numSubarraysWithSum(int[] nums, int goal) {
35        // return cntSubArrayWith(sum <= goal) - cntSubArrayWith(sum <= goal - 1)
36        return countAtMost(nums, goal) - countAtMost(nums, goal - 1);
37    }
38}
39