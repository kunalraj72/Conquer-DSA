// Last updated: 05/06/2026, 05:07:50
1class Solution {
2
3    public void findValidCombinations(int ind, int target, int[] candidates, List<Integer> ds, List<List<Integer>> ans){
4
5        if(target == 0){
6            ans.add(new ArrayList<>(ds));
7            return;
8        }
9
10        if(target < 0 || ind >= candidates.length){
11            return;
12        }
13
14        ds.add(candidates[ind]);
15        findValidCombinations(ind, target - candidates[ind], candidates, ds, ans);
16        ds.remove(ds.size() - 1);
17        findValidCombinations(ind + 1, target, candidates, ds, ans);
18    }
19
20
21    public List<List<Integer>> combinationSum(int[] candidates, int target) {
22        List<List<Integer>> ans = new ArrayList<>();
23        List<Integer> ds = new ArrayList<>();
24        findValidCombinations(0, target, candidates, ds, ans);
25        return ans;
26    }
27}