// Last updated: 12/06/2026, 02:45:11
1class Solution {
2
3    //Watch code with mik video for explanation, there's a bette approach than this as well, see next submission. 
4    
5    //In this solution, we are focusing on calculating difference between score scored by player1
6    //and player 2 by exploring both the option(picking i by p1 and then j by p1) and then
7    //returning max(pick_i, pick_j), finally if p1_score > p2_score then 
8    // solve(nums, 0, n - 1) >= 0; this will return true.
9
10    public int solve(int[] nums, int i, int j){
11        //Base condition
12        if(i == j) return nums[i];
13        if(i > j) return 0;
14
15        int pick_i = nums[i] - solve(nums, i + 1, j);
16        int pick_j = nums[j] - solve(nums, i, j - 1);
17        return Math.max(pick_i, pick_j);
18    }
19
20    public boolean predictTheWinner(int[] nums) {
21        int n = nums.length;
22        return solve(nums, 0, n - 1) >= 0;
23    }
24}