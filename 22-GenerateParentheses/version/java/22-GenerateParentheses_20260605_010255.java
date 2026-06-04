// Last updated: 05/06/2026, 01:02:55
1class Solution {
2
3    public void storeParenthesis(String str, int open, int close, int n, List<String> ans){
4
5        if(open == n && close == n){
6            ans.add(str);
7            return;
8        }
9
10        if(open != n) storeParenthesis(str + "(", open + 1, close, n, ans);
11        if(close != n && close < open) storeParenthesis(str + ")", open, close + 1, n, ans);
12    }
13
14    public List<String> generateParenthesis(int n) {
15        List<String> ans = new ArrayList<>();
16        storeParenthesis("", 0, 0, n, ans);
17
18        return ans;
19    }
20}