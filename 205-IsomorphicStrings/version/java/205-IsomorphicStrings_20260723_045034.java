// Last updated: 23/07/2026, 04:50:34
1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int s_len = s.length();
4        int t_len = t.length();
5        Map<Character, Character> mps = new HashMap<>();
6        Map<Character, Character> mpt = new HashMap<>();
7
8        if(s_len != t_len){
9            return false;
10        }
11
12        int i = 0;
13        while(i < s_len){
14            if(mps.containsKey(s.charAt(i)) && mps.get(s.charAt(i)) != t.charAt(i)){
15                return false;
16            }
17            //for different keys in mps value can be same that's why we need to check mpt and string s also.
18            //Dry run with this TC by removing this else if condition, u'll understand: s="badc", t="baba"
19            else if(mpt.containsKey(t.charAt(i)) && mpt.get(t.charAt(i)) != s.charAt(i)){
20                return false;
21            }
22            else{
23                mps.put(s.charAt(i), t.charAt(i));
24                mpt.put(t.charAt(i), s.charAt(i));
25            }
26            i++;
27        }
28        return true;
29    }
30}