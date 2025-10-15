// Last updated: 16/10/2025, 04:26:47
class Solution {

    public int helper(int[] nums, int l, int r){
        if(l == r) return nums[l];

        int pickLeft = nums[l] - helper(nums, l + 1, r);
        int pickRight = nums[r] - helper(nums, l, r - 1);

        return Math.max(pickLeft, pickRight);
    }

    public boolean predictTheWinner(int[] nums) {
        return helper(nums, 0, nums.length - 1) >= 0;
    }
}

// Recursive Tree Visualization [1,5,2]
// dfs(0,2)
//  ├── pickLeft = 1 - dfs(1,2)
//  │      └── dfs(1,2)
//  │            ├── pickLeft = 5 - dfs(2,2)=5-2=3
//  │            ├── pickRight= 2 - dfs(1,1)=2-5=-3
//  │            └── return 3
//  │      → pickLeft = 1 - 3 = -2
//  │
//  ├── pickRight = 2 - dfs(0,1)
//  │      └── dfs(0,1)
//  │            ├── pickLeft = 1 - dfs(1,1)=1-5=-4
//  │            ├── pickRight= 5 - dfs(0,0)=5-1=4
//  │            └── return 4
//  │      → pickRight = 2 - 4 = -2
//  │
//  └── return max(-2, -2) = -2