// Last updated: 11/06/2026, 01:29:25
1class Solution {
2
3    public List<List<Integer>> findPermutations(boolean[] used, int[] nums, List<Integer> ds, List<List<Integer>> ans){
4
5        if(ds.size() == nums.length && !ans.contains(ds)){
6            ans.add(new ArrayList<>(ds));
7            return ans;
8        }
9    
10        for(int i = 0; i < nums.length; i++){
11            if(used[i]) continue;
12
13
14            used[i] = true;
15            ds.add(nums[i]);
16            findPermutations(used, nums, ds, ans);
17            ds.remove(ds.size() - 1);
18            used[i] = false; // un-choose (backtrack)
19        }
20
21        return ans;
22    }
23
24
25    public List<List<Integer>> permuteUnique(int[] nums) {
26        List<List<Integer>> ans = new ArrayList<>();
27        List<Integer> ds = new ArrayList<>();
28        boolean[] used = new boolean[nums.length];
29        //Arrays.sort(nums); //to handle duplicates
30        return findPermutations(used, nums, ds, ans);
31    }
32}