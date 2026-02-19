// Last updated: 20/02/2026, 04:32:28
1class Solution {
2
3    public void swap(int [] nums, int idx1, int idx2){
4        int temp = nums[idx1];
5        nums[idx1] = nums[idx2];
6        nums[idx2] = temp;
7    }
8
9    public void sortColors(int[] nums) {
10        //Similar as sort 0's, 1's and 2's problem
11        //This is called Dutch National Flag Algorithm.
12        int n = nums.length;
13        int l=0,m=0;
14        int h = n-1;
15        while(m <= h){ // [2,0,1] : Try this test case u will understand why equality.
16            if(nums[m] == 0){
17                swap(nums, m, l);
18                m++;
19                l++;
20            }
21            else if(nums[m] == 1){
22                m++;
23            }
24            else if(nums[m] == 2){
25                swap(nums, m, h);
26                h--;
27            }
28        }
29    }
30}