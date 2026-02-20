// Last updated: 21/02/2026, 03:37:41
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3       
4        int n = nums.length;
5        int oIndex = 1; //negative
6        int eIndex = 0; //positive
7        int ans[] = new int[n];
8        for(int i=0;i<n;i++){
9            if(nums[i] >= 0){
10                ans[eIndex] = nums[i];
11                eIndex += 2;
12            }
13            else{
14                ans[oIndex] = nums[i];
15                oIndex += 2;
16            }
17        }
18        return ans;
19   }
20}