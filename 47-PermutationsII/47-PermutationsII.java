// Last updated: 19/10/2025, 11:10:05
class Solution {

    public List<List<Integer>> findPermutations(boolean[] used, int[] nums, List<Integer> ds, List<List<Integer>> ans){

        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }
    
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            used[i] = true;
            ds.add(nums[i]);
            findPermutations(used, nums, ds, ans);
            ds.remove(ds.size() - 1);
            used[i] = false; // un-choose (backtrack)
        }

        return ans;
    }


    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums); //to handle duplicates
        return findPermutations(used, nums, ds, ans);
    }
}