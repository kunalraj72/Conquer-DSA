// Last updated: 24/07/2026, 03:29:03
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        int n = nums.length;
4        int l = 0;
5        int r = 0;
6
7        while(r < n){
8            if(nums[l] == nums[r]){
9                r++;
10            }
11            else{
12                l++;
13                nums[l] = nums[r];
14                r++;
15            }
16        }
17        return l + 1;
18    }
19}