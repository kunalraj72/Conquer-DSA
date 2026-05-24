// Last updated: 25/05/2026, 03:05:06
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
11            if(mp.size() == j - i + 1){
12                    maxLen = Math.max(maxLen, j - i + 1);
13            }
14            if(mp.size() < j - i + 1){ //menas substring has got duplicates
15                while(mp.size() < j - i + 1 && i <= j){
16                    mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) - 1);
17                    if(mp.get(s.charAt(i)) <= 0){
18                        mp.remove(s.charAt(i));
19                    }
20                    i++;
21                }
22            }
23            
24            j++;
25        }
26        return maxLen;
27    }
28}