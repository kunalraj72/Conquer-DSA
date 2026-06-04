// Last updated: 05/06/2026, 02:42:55
1class Solution {
2
3    public void storeCombinations(int k, int n, int i, List<Integer> ds, List<List<Integer>> ans){
4        if(ds.size() == k){
5            ans.add(new ArrayList<> (ds));
6            return;
7        }
8
9        if(i > n) return;
10
11        ds.add(i);
12        storeCombinations(k, n, i + 1, ds, ans);
13        ds.remove(ds.size() - 1); //removing last inserted element from ds list
14        storeCombinations(k, n, i + 1, ds, ans);
15
16    }
17    
18
19    public List<List<Integer>> combine(int n, int k) {
20        List<List<Integer>> ans = new ArrayList<>();
21        List<Integer> ds = new ArrayList<>();
22        storeCombinations(k, n, 1, ds, ans);
23
24        return ans;
25    }
26}
27
28//TC: Average Case: O(k * nck), Worst Case: O(n^2) for caclulating all combinations
29//SC: O(k * nck) for ans + O(k) for ds. + O(n) recursive stack space ~= O(n)
30
31
32// NOTE: 
33// primitive types (like int k, int i) are passed by value → each recursive call gets 
34// its own independent copy.
35
36// objects (like List<Integer> ds) are passed by reference → all recursive calls 
37// share the same underlying list object in memory
38// (unless you explicitly create a new one).