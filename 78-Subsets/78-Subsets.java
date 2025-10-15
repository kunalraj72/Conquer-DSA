// Last updated: 16/10/2025, 04:29:57
class Solution {

    public void helper(int idx, int n, int[] nums, List<Integer> ds, List<List<Integer>> ans){
        if(idx >= n){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        helper(idx + 1, n, nums, ds, ans); //pick
        ds.remove(ds.size() - 1);
        helper(idx + 1, n, nums, ds, ans); //not pick
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<Integer> ds = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, n, nums, ds, ans);
        return ans;
    }
}