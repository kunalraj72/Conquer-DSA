// Last updated: 16/10/2025, 04:26:58
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int idx = Math.abs(nums[i]) - 1;
            if(nums[idx] > 0){
                nums[idx] = -nums[idx]; 
            }else{
                res.add(Math.abs(nums[i]));
            }
        }
        return res;
    }
}