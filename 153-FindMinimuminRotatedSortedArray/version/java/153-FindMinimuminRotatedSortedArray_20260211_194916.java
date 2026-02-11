// Last updated: 11/02/2026, 19:49:16
1class Solution {
2    public int findMin(int[] nums) {
3        int n = nums.length;
4        int s = 0;
5        int e = n-1;
6
7        //Edge cases
8        if(n == 1){   //size = 1
9            return nums[0];
10        }
11        if(nums[0] < nums[n-1]){  //12345  not rotated
12            return nums[0]; 
13        }
14
15        while(s < e){
16            int mid = s + (e - s)/2;
17            if(nums[mid] > nums[e]){
18                s = mid + 1;
19            }else if(nums[mid] < nums[e]){
20                e = mid;
21            }
22        }
23        return nums[s] | nums[e];  //return any one
24    }
25}