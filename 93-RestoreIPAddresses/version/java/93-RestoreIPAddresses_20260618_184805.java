// Last updated: 18/06/2026, 18:48:05
1class Solution {
2
3    public boolean isValid(String s){
4        if(s.charAt(0) == '0' || Integer.parseInt(s) > 255){
5            return false;
6        }
7        return true;
8    }
9  
10    public void helper(String s, int i, int partn, String ans, List<String> res){
11
12        if(i == s.length() || partn > 4){
13            if(i == s.length() && partn > 4) res.add(ans.substring(0, ans.length() - 1));
14            return;
15        }
16
17        helper(s, i + 1, partn + 1, ans + s.charAt(i) + '.', res);
18
19        if(i + 2 <= s.length() && isValid(s.substring(i, i + 2))){
20            helper(s, i + 2, partn + 1, ans + s.substring(i, i + 2) + '.', res);
21        }
22        if(i + 3 <= s.length() && isValid(s.substring(i, i + 3))) {
23            helper(s, i + 3, partn + 1, ans + s.substring(i, i + 3) + '.', res);
24        }
25    }
26
27    public List<String> restoreIpAddresses(String s) {
28        List<String> res = new ArrayList<>();
29        helper(s, 0, 1, "", res);
30        return res;
31    }
32}