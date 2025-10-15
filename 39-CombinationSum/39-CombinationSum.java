// Last updated: 16/10/2025, 04:30:49
class Solution {

    public List<List<Integer>> findValidCombinations(int ind, int target, int[] candidates, List<Integer> ds, List<List<Integer>> ans){

        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return ans;
        }

        if(target < 0 || ind >= candidates.length){
            return ans;
        }

        ds.add(candidates[ind]);
        findValidCombinations(ind, target - candidates[ind], candidates, ds, ans);
        ds.remove(ds.size() - 1);
        findValidCombinations(ind + 1, target, candidates, ds, ans);

        return ans;
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        return findValidCombinations(0, target, candidates, ds, ans);
    }
}