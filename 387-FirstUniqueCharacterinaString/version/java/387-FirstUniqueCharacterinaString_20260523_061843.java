// Last updated: 23/05/2026, 06:18:43
1class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character, Integer> mp = new HashMap<>();
4        int n = s.length();
5
6        for(int i = 0; i < n; i++){
7            if(!mp.containsKey(s.charAt(i))){
8                mp.put(s.charAt(i), i);
9            }else{
10                mp.put(s.charAt(i), Integer.MAX_VALUE); //Agar koi dupicate charater mile toh uss charater ka frequency itna badha do ki wo second loop me lower indexes se compete hi nhi kar paye
11            }
12        }
13        int firstChar = Integer.MAX_VALUE;
14        for(Character c : mp.keySet()){
15            if(mp.get(c) < firstChar){
16                firstChar = mp.get(c);
17            }
18        }
19        return firstChar == Integer.MAX_VALUE ? -1 : firstChar;
20    }
21}