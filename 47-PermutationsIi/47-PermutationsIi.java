// Last updated: 16/10/2025, 04:30:40
class Solution {

    public List<List<Integer>> findPermutations(boolean[] used, int[] nums, List<Integer> ds, List<List<Integer>> ans){

        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }
    
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;

            // \U0001f538 Skip duplicates: if nums[i] == nums[i - 1] && used[i -1] then we need 
            // to skip that one. But Why ? Do dry run [1,1,2], u will understand 
            // that repeated permutation will come.
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1]) continue;

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