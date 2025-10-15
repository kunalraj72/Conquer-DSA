// Last updated: 16/10/2025, 04:31:35
class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        Map<Character, Integer> mp = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );

        int ans = 0;
        int i = 0;

        while(i < n){
            if(i + 1 <= n - 1 && mp.get(s.charAt(i)) < mp.get(s.charAt(i + 1))){
                ans -= mp.get(s.charAt(i));
            }else{
                ans += mp.get(s.charAt(i));
                
            }
            i++;
        }
        return ans;
    }
}