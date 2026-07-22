// Last updated: 23/07/2026, 04:00:28
1class Solution {
2    public int maxDepth(String s) {
3        int n = s.length();
4        int maxDepth = 0;
5        int cnt = 0;
6        for(int i = 0; i < n; i++){
7            if(s.charAt(i) == '('){
8                cnt++;
9            }
10            if(s.charAt(i) == ')'){
11                cnt--;
12            }
13            maxDepth = Math.max(cnt, maxDepth);
14        }
15        return maxDepth;
16    }
17}