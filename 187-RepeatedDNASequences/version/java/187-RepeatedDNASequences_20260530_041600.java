// Last updated: 30/05/2026, 04:16:00
1class Solution {
2    public List<String> findRepeatedDnaSequences(String s) {
3        int n = s.length();
4        HashMap<String, Integer> mp = new HashMap<>();
5        int i = 0;
6        int j = 9;
7        List<String> res = new ArrayList<>();
8
9        while(j < n){
10            String str = s.substring(i, j + 1); //substring method me last index cnt nhi hota isliye till j + 1
11            if(mp.containsKey(str) && mp.get(str) == 1){
12                res.add(str);
13                mp.put(str, mp.getOrDefault(str, 0) + 1); // this is to eliminate duplicate values
14            }else{
15                mp.putIfAbsent(str, 1);
16            }
17            i++;
18            j++;
19        }
20        return res;
21    }
22}