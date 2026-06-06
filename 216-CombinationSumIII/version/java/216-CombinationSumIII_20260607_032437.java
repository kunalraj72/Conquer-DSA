// Last updated: 07/06/2026, 03:24:37
1class Solution {
2
3    public void findValidCombinations(int k, int sum, int i, int n, List<Integer> ds, List<List<Integer>> ans){
4        if(k == 0){
5            if(sum == n){
6                ans.add(new ArrayList<>(ds));
7                return;
8            }
9        }
10
11        if(i > 9){
12            return;
13        }
14
15        ds.add(i);
16        findValidCombinations(k - 1, sum + i, i + 1, n, ds, ans); //pick
17        ds.remove(ds.size() - 1);
18        findValidCombinations(k, sum, i + 1, n, ds, ans); //not pick
19
20    }
21
22    public List<List<Integer>> combinationSum3(int k, int n) {
23        List<List<Integer>> ans = new ArrayList<>();
24        List<Integer> ds = new ArrayList<>();
25        findValidCombinations(k, 0, 1, n, ds, ans);
26
27        return ans;
28    }
29}
30
31// Time Complexity : O(2^N[at each step 2 choice] * N[adding new ArrayList to ans]) = O(2^9 * 9)
32// Space complexity : O(N)[recursion] + O(N)[ds] + O(nck * k)[ans]