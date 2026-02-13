// Last updated: 13/02/2026, 08:55:27
1class Solution {
2    public int romanToInt(String s) {
3        int n = s.length();
4        Map<Character, Integer> mp = Map.of(
5            'I',1,
6            'V',5,
7            'X',10,
8            'L',50,
9            'C',100,
10            'D',500,
11            'M',1000
12        );
13
14        int ans = 0;
15        int i = 0;
16
17        while(i < n){
18            if(i + 1 <= n - 1 && mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))){
19                ans -= mp.get(s.charAt(i));
20            }else{
21                ans += mp.get(s.charAt(i));
22                
23            }
24            i++;
25        }
26        return ans;
27    }
28}