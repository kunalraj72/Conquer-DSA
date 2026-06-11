// Last updated: 12/06/2026, 02:37:01
1class Solution {
2
3    //Watch code with mik video for explanation, there's a bette approach than this as well, see next submission. 
4    
5    //In this solution, we are focusing on calculating maxScore scored by player1 and then player2 score = sum - player1 score, finally reutrn player1 score > player2 score;
6
7    public int solve(int[] nums, int i, int j){
8        //Base condition
9        if(i == j) return nums[i];
10        if(i > j) return 0;
11
12        int pick_i = nums[i] + Math.min(solve(nums, i + 2, j), solve(nums, i + 1, j - 1));
13        int pick_j = nums[j] + Math.min(solve(nums, i + 1, j - 1), solve(nums, i, j - 2));
14
15        return Math.max(pick_i, pick_j);
16    }
17
18    public boolean predictTheWinner(int[] nums) {
19        int n = nums.length;
20        int total_score = Arrays.stream(nums).sum();
21        int player1_score = solve(nums, 0, n - 1);
22        int player2_score = total_score - player1_score;
23
24        return player1_score >= player2_score;
25    }
26}