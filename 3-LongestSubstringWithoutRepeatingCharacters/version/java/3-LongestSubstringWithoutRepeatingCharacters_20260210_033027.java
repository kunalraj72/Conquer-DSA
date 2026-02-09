// Last updated: 10/02/2026, 03:30:27
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int i = 0;
5        int j = 0;
6        int maxLen = 0;
7        HashMap<Character,Integer> mp = new HashMap<>();
8        
9        while(j < n){
10            mp.put(s.charAt(j), mp.getOrDefault(s.charAt(j), 0) + 1);
11            if(mp.size() < j - i + 1){
12                while(mp.size() < j - i + 1 && i <= j){
13                    mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) - 1);
14                    if(mp.get(s.charAt(i)) <= 0){
15                        mp.remove(s.charAt(i));
16                    }
17                    i++;
18                }
19            }
20            if(mp.size() == j - i + 1){
21                    maxLen = Math.max(maxLen, j - i + 1);
22            }
23            j++;
24        }
25        return maxLen;
26    }
27}