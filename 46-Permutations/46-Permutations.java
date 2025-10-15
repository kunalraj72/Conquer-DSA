// Last updated: 16/10/2025, 04:30:42
class Solution {
// Video: CodeWithMik for better understanding of this question 7 recursion with loops. 
    public List<List<Integer>> findPermutations(boolean[] used, int[] nums, List<Integer> ds, List<List<Integer>> ans){

        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }
    
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            used[i] = true;
            ds.add(nums[i]);
            findPermutations(used, nums, ds, ans);
            ds.remove(ds.size() - 1);
            used[i] = false; // un-choose (backtrack)
        }

        return ans;
    }


    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        return findPermutations(used, nums, ds, ans);
    }
}