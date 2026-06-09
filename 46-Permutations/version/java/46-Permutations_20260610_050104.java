// Last updated: 10/06/2026, 05:01:04
1class Solution {
2//Video: U can also watch watch Nikhil Lohia Video
3    public void findPermutations(int[] nums, List<Integer> ds, List<List<Integer>> ans){
4
5        if(ds.size() == nums.length){
6            ans.add(new ArrayList<>(ds));
7            return;
8        }
9    
10        for(int i = 0; i < nums.length; i++){
11            if(ds.contains(nums[i])){
12                continue;
13            }
14
15            ds.add(nums[i]);
16            findPermutations(nums, ds, ans);
17            ds.remove(ds.size() - 1);
18        }
19    }
20
21
22    public List<List<Integer>> permute(int[] nums) {
23        List<List<Integer>> ans = new ArrayList<>();
24        List<Integer> ds = new ArrayList<>();
25        findPermutations(nums, ds, ans);
26        return ans;
27    }
28}