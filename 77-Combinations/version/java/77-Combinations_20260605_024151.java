// Last updated: 05/06/2026, 02:41:51
1class Solution {
2
3    public void storeCombinations(int k, int n, int i, List<Integer> ds, List<List<Integer>> ans){
4        if(ds.size() == k){
5            ans.add(new ArrayList<> (ds));
6            return;
7        }
8
9        ds.add(i);
10        if(i <= n) storeCombinations(k, n, i + 1, ds, ans);
11        ds.remove(ds.size() - 1); //removing last inserted element from ds list
12        if(i <= n) storeCombinations(k, n, i + 1, ds, ans);
13
14    }
15    
16
17    public List<List<Integer>> combine(int n, int k) {
18        List<List<Integer>> ans = new ArrayList<>();
19        List<Integer> ds = new ArrayList<>();
20        storeCombinations(k, n, 1, ds, ans);
21
22        return ans;
23    }
24}
25
26//TC: Average Case: O(k * nck), Worst Case: O(n^2) for caclulating all combinations
27//SC: O(k * nck) for ans + O(k) for ds. + O(n) recursive stack space ~= O(n)
28
29
30// NOTE: 
31// primitive types (like int k, int i) are passed by value → each recursive call gets 
32// its own independent copy.
33
34// objects (like List<Integer> ds) are passed by reference → all recursive calls 
35// share the same underlying list object in memory
36// (unless you explicitly create a new one).