// Last updated: 30/07/2026, 02:43:19
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int n = nums.length;
4        int i = 0, j = 0;
5
6        while(j < n){
7            if(nums[j] == 0){
8                j++;
9            }else{
10                int temp = nums[i];
11                nums[i] = nums[j];
12                nums[j] = temp;
13                i++;
14                j++;
15            }
16        }
17    }
18}
19
20//Hint: Skips pointer i whenever 0 or else swap with pointer j.