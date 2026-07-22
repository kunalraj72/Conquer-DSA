// Last updated: 23/07/2026, 05:04:08
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s == null || t == null || s.length() != t.length()) return false;
4        char[] sChars = s.toCharArray();
5        char[] tChars = t.toCharArray();
6        HashMap<Character, Integer> mp = new HashMap<>();
7        
8        for(char c : sChars){
9            mp.put(c, mp.getOrDefault(c, 0) + 1);
10        }
11
12        for(char c : tChars){
13            if(mp.containsKey(c) && mp.get(c) > 0){
14                mp.put(c, mp.get(c) - 1);
15                if(mp.get(c) == 0) mp.remove(c);
16            }
17
18        }
19
20        return mp.isEmpty() ? true : false;
21    }
22}