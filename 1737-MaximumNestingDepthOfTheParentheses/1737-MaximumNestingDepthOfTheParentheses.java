// Last updated: 16/10/2025, 04:24:56
class Solution {
    public int maxDepth(String s) {
        int n = s.length();
        int maxDepth = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '('){
                cnt++;
            }else if(s.charAt(i) == ')'){
                cnt--;
            }
            maxDepth = Math.max(maxDepth, cnt);
        }
        return maxDepth;
    }
}