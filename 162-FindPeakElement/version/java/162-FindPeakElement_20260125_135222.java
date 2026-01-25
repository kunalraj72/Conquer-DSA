// Last updated: 25/01/2026, 13:52:22
1class Solution {
2    public int findPeakElement(int[] nums) {
3      int n = nums.length;
4      int s = 0;
5      int e = n - 1;
6      
7      //edge case
8      if(n == 1) return 0;
9      if(n == 2 && nums[0] > nums[1]) return 0;
10      if(n == 2 && nums[0] < nums[1]) return 1;
11      
12       while(s < e){
13           int mid = s + (e - s)/2;
14           
15           if(nums[mid] < nums[mid + 1]){
16            s = mid + 1;
17           }else{
18            e = mid;
19           }
20       }
21       return s | e;
22    }
23}