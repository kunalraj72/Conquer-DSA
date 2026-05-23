// Last updated: 23/05/2026, 07:07:06
1class Solution {
2    public List<String> commonChars(String[] words) {
3        List<String> ans = new ArrayList<>();
4        HashMap<Character, Integer> mp = new HashMap<>();
5        for(int i = 0; i < words[0].length();i ++){
6            mp.put(words[0].charAt(i), mp.getOrDefault(words[0].charAt(i), 0) + 1);
7        }
8        for(int i = 1; i < words.length; i++){
9            HashMap<Character, Integer> tmpMp = new HashMap<>();
10            String s = words[i];
11            for(int j = 0; j < s.length(); j++){
12                tmpMp.put(s.charAt(j), tmpMp.getOrDefault(s.charAt(j), 0) + 1);
13            }
14            //intersection between mp and tmpMp
15            for(Character c : new HashSet<> (mp.keySet())){
16                if(tmpMp.containsKey(c)){
17                    mp.put(c, Math.min(mp.get(c), tmpMp.get(c)));
18                }else{
19                    mp.remove(c);
20                }
21            }
22        }
23    
24        for(Character c : mp.keySet()){
25            if(mp.get(c) > 0){
26                int count = mp.get(c);
27                while(count-- > 0){
28                    ans.add(c.toString());
29                }
30            } 
31        }
32        return ans;
33    }
34}