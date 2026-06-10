// Last updated: 11/06/2026, 01:37:00
1class Solution {
2
3    public List<List<Integer>> findPermutations(boolean[] used, int[] nums, List<Integer> ds, List<List<Integer>> ans){
4
5        if(ds.size() == nums.length){
6            ans.add(new ArrayList<>(ds));
7            return ans;
8        }
9    
10        for(int i = 0; i < nums.length; i++){
11            if(used[i]) continue;
12
13            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == true) continue;
14
15            used[i] = true;
16            ds.add(nums[i]);
17            findPermutations(used, nums, ds, ans);
18            ds.remove(ds.size() - 1);
19            used[i] = false; // un-choose (backtrack)
20        }
21
22        return ans;
23    }
24
25
26    public List<List<Integer>> permuteUnique(int[] nums) {
27        List<List<Integer>> ans = new ArrayList<>();
28        List<Integer> ds = new ArrayList<>();
29        boolean[] used = new boolean[nums.length];
30        Arrays.sort(nums); //to handle duplicates
31        return findPermutations(used, nums, ds, ans);
32    }
33}