// Last updated: 16/10/2025, 04:31:17
class Solution {

    public void storeParenthesis(String str, int open, int close, int n, List<String> ans){
        if(open == n && close == n){
            ans.add(str);
            return;
        }

        if(open > n || close > n){
            return;
        }

        if(close > open){
            return;
        }

        storeParenthesis(str + "(", open + 1, close, n, ans);
        storeParenthesis(str + ")", open, close + 1, n, ans);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        storeParenthesis("", 0, 0, n, ans);

        return ans;
    }
}