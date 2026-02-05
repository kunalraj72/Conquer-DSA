// Last updated: 06/02/2026, 02:22:45
1class Solution {
2    public List<Integer> findAnagrams(String s, String p) {
3        int n = s.length();
4        List<Integer> ans = new ArrayList<>();
5        HashMap<Character, Integer> smap = new HashMap<>();
6        HashMap<Character, Integer> pmap = new HashMap<>();
7        for(char c : p.toCharArray()){
8            pmap.put(c, pmap.getOrDefault(c, 0) + 1);
9        }
10        int i = 0;
11        int j = 0;
12        int k = p.length();
13
14        while(j < n){
15            smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 0) + 1);
16            if(j - i + 1 < k){
17                j++;
18            }
19            else if(j - i + 1 == k){
20                if(smap.equals(pmap)){
21                    ans.add(i);
22                }
23                smap.put(s.charAt(i), smap.getOrDefault(s.charAt(i), 0) - 1);
24                if(smap.get(s.charAt(i)) == 0){
25                    smap.remove(s.charAt(i));
26                }
27                i++;
28                j++;
29            }
30        }
31        return ans;
32    }
33}