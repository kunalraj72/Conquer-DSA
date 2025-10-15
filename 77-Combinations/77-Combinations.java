// Last updated: 16/10/2025, 04:29:59
class Solution {

    public List<List<Integer>> storeCombinations(int k, int i, int n, List<Integer> ds, List<List<Integer>> ans){
        if(k == 0){
            ans.add(new ArrayList<>(ds));
            return ans;
        }

        if(i > n){
            return ans;
        }

        ds.add(i);
        storeCombinations(k - 1, i + 1, n, ds, ans);
        ds.remove(ds.size() - 1);
        storeCombinations(k, i + 1, n, ds, ans);

        return ans;

    }

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        return storeCombinations(k, 1, n, ds, ans);
    }
}

//TC: Average Case: O(k * nck), Worst Case: O(n^2) for caclulating all combinations
//SC: O(k * nck) for ans + O(k) for ds. + O(n) recursive stack space ~= O(n)


// NOTE: 
// primitive types (like int k, int i) are passed by value → each recursive call gets 
// its own independent copy.

// objects (like List<Integer> ds) are passed by reference → all recursive calls 
// share the same underlying list object in memory
// (unless you explicitly create a new one).