// Last updated: 02/06/2026, 01:57:03
1class Solution {
2
3    public void recReverse(char[] str, int s, int e){
4
5        if(s >= e){
6            return;
7        }
8
9        char temp = str[s];
10        str[s] = str[e];
11        str[e] = temp;
12
13        recReverse(str, s+1, e-1);
14
15    }
16
17    public void reverseString(char[] s) {
18        int n = s.length;
19        recReverse(s, 0, n - 1);
20    }
21}