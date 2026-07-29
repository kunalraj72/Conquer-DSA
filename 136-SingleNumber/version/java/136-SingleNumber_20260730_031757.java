// Last updated: 30/07/2026, 03:17:57
1class Solution {
2    public int singleNumber(int[] nums) {
3        //a xor a = 0, a xor 0 = a,  0 xor a = a
4        int ans = 0;
5        for(int i = 0; i < nums.length; i++){
6            ans = ans ^ nums[i];
7        }
8        return ans;
9    }
10}