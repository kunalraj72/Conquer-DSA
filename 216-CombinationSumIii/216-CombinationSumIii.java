// Last updated: 16/10/2025, 04:28:01
class Solution {

    public List<List<Integer>> findValidCombinations(int k, int sum, int i, int n, List<Integer> ds, List<List<Integer>> ans){
        if(k == 0){
            if(sum == n){
                ans.add(new ArrayList<>(ds));
                return ans;
            }
        }

        if(i > 9){
            return ans;
        }

        ds.add(i);
        findValidCombinations(k - 1, sum + i, i + 1, n, ds, ans);
        ds.remove(ds.size() - 1);
        findValidCombinations(k, sum, i + 1, n, ds, ans);

        return ans;
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        return findValidCombinations(k, 0, 1, n, ds, ans);
    }
}

// Time Complexity : O(2^N[at each step 2 choice] * N[adding new ArrayList to ans]) = O(2^9 * 9)
// Space complexity : O(N)[recursion] + O(N)[ds] + O(nck * k)[ans]