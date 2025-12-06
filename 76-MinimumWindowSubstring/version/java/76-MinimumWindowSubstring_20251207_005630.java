// Last updated: 07/12/2025, 00:56:30
1class Solution {
2    public String minWindow(String s, String t) {
3        int n = s.length();
4        Map<Character,Integer> mp = new HashMap<>();
5        String ans = null;
6        for(int i=0;i<t.length();i++){
7            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0) + 1);
8        }
9        int reqDistCharCount = mp.size();
10        int i = 0;
11        int j = 0;
12        while(j < n){
13            if(mp.containsKey(s.charAt(j))){
14                mp.put(s.charAt(j), mp.get(s.charAt(j)) - 1); 
15                if(mp.get(s.charAt(j)) == 0){
16                    reqDistCharCount--;
17                }  
18            }
19
20            if(reqDistCharCount == 0){
21                while(reqDistCharCount == 0){
22                    if(mp.containsKey(s.charAt(i))){
23                        mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
24                        if(mp.get(s.charAt(i)) > 0){
25                            reqDistCharCount++;
26                        }
27                    }
28                    if(ans == null || j - i + 1 < ans.length()){
29                            ans = s.substring(i,j+1);
30                    }
31                    i++;
32                }
33            }
34            j++;
35        }
36        return ans == null ? "" : ans;
37    }
38}