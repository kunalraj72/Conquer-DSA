// Last updated: 16/10/2025, 04:27:59
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
}