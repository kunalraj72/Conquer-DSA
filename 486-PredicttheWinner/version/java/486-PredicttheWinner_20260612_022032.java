// Last updated: 12/06/2026, 02:20:32
1class Solution {
2
3    //Watch code with mik video for solution
4
5    public int solve(int[] nums, int i, int j){
6        //Base condition
7        if(i == j) return nums[i];
8        if(i > j) return 0;
9
10        int pick_i = nums[i] + Math.min(solve(nums, i + 2, j), solve(nums, i + 1, j - 1));
11        int pick_j = nums[j] + Math.min(solve(nums, i + 1, j - 1), solve(nums, i, j - 2));
12
13        return Math.max(pick_i, pick_j);
14    }
15
16    public boolean predictTheWinner(int[] nums) {
17        int n = nums.length;
18        int total_score = Arrays.stream(nums).sum();
19        int player1_score = solve(nums, 0, n - 1);
20        int player2_score = total_score - player1_score;
21
22        return player1_score >= player2_score;
23    }
24}