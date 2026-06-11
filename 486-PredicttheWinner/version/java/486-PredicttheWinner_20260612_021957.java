// Last updated: 12/06/2026, 02:19:57
1class Solution {
2
3    public int solve(int[] nums, int i, int j){
4        //Base condition
5        if(i == j) return nums[i];
6        if(i > j) return 0;
7
8        int pick_i = nums[i] + Math.min(solve(nums, i + 2, j), solve(nums, i + 1, j - 1));
9        int pick_j = nums[j] + Math.min(solve(nums, i + 1, j - 1), solve(nums, i, j - 2));
10
11        return Math.max(pick_i, pick_j);
12    }
13
14    public boolean predictTheWinner(int[] nums) {
15        int n = nums.length;
16        int total_score = Arrays.stream(nums).sum();
17        int player1_score = solve(nums, 0, n - 1);
18        int player2_score = total_score - player1_score;
19
20        return player1_score >= player2_score;
21    }
22}