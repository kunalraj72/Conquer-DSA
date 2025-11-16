// Last updated: 17/11/2025, 00:01:19
class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        Map<Character,Integer> mp = new HashMap<>();
        String ans = null;
        for(int i=0;i<t.length();i++){
            mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0) + 1);
        }
        int reqDistCharCount = mp.size();
        int i = 0;
        int j = 0;
        while(j < n){
            if(mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j), mp.get(s.charAt(j)) - 1); 
                if(mp.get(s.charAt(j)) == 0){
                    reqDistCharCount--;
                }  
            }

            if(reqDistCharCount == 0){
                while(reqDistCharCount == 0){
                    if(mp.containsKey(s.charAt(i))){
                        mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
                        if(mp.get(s.charAt(i)) > 0){
                            reqDistCharCount++;
                        }
                    }
                    if(ans == null || j - i + 1 < ans.length()){
                            ans = s.substring(i,j+1);
                    }
                    i++;
                }
            }
            j++;
        }
        return ans == null ? "" : ans;
    }
}