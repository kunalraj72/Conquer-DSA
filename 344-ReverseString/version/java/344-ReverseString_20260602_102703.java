// Last updated: 02/06/2026, 10:27:03
1class Solution {
2
3    public void recReverse(char[] str, int s, int e){
4
5       if(s > e) return;
6
7       char temp = str[s];
8       str[s] = str[e];
9       str[e] = temp;
10       recReverse(str, s + 1, e - 1);
11
12    }
13
14    public void reverseString(char[] s) {
15        int n = s.length;
16        recReverse(s, 0, n - 1);
17    }
18}