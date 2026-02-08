// Last updated: 08/02/2026, 18:47:38
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int n = s.length();
4        int i = 0;
5        int j = 0;
6        int maxLen = 0;
7        int maxFreq = 0;
8        Map<Character, Integer> mp = new HashMap<>();
9
10        while(j < n){
11           char c = s.charAt(j);
12           mp.put(c, mp.getOrDefault(c, 0) + 1);
13           maxFreq = Math.max(maxFreq, mp.get(c));
14           int windowLen = j - i + 1;
15           //[windowLen - maxFreq] tells no of char we need to replace in 
16           //substring(current window) to match with most freq char
17           if(windowLen - maxFreq > k){
18              while(windowLen - maxFreq > k && i <= j){
19                mp.put(s.charAt(i), mp.get(s.charAt(i)) - 1);
20                if(mp.get(s.charAt(i)) <= 0){
21                    mp.remove(s.charAt(i));
22                }
23                i++;
24                windowLen = j - i + 1;
25              }
26            }
27
28            if(windowLen - maxFreq <= k){
29                maxLen = Math.max(maxLen, windowLen);
30            }
31            
32            j++;
33        }
34        return maxLen;
35    }
36}