// Last updated: 16/10/2025, 04:28:11
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int s_len = s.length();
        int t_len = t.length();
        Map<Character, Character> mps = new HashMap<>();
        Map<Character, Character> mpt = new HashMap<>();

        if(s_len != t_len){
            return false;
        }

        int i = 0;
        while(i < s_len){
            if(mps.containsKey(s.charAt(i)) && mps.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            else if(mpt.containsKey(t.charAt(i)) && mpt.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            else{
                mps.put(s.charAt(i), t.charAt(i));
                mpt.put(t.charAt(i), s.charAt(i));
            }
            i++;
        }
        return true;
    }
}