// Last updated: 16/10/2025, 04:26:56
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
         int n = nums.length;
         for(int i=0;i<n;i++){
             int m = Math.abs(nums[i]) - 1;
             nums[m] = nums[m] > 0 ? -nums[m] : nums[m];
         }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(nums[i] > 0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}