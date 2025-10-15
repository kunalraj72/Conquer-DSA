// Last updated: 16/10/2025, 04:31:30

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        int ans = 0;
        Arrays.sort(nums);

        for(int i = 0; i < n - 2; i++){ 
            int j = i + 1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum - target) < minDiff){
                    minDiff = Math.abs(sum - target);
                    ans = sum;
                }
                
                if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return ans;
    }
}