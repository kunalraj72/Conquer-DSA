// Last updated: 02/06/2026, 10:27:58
1class Solution {
2
3    public void recReverse(char[] str, int s, int e){
4
5       //Base
6       if(s > e) return;
7       
8       //Induction
9       char temp = str[s];
10       str[s] = str[e];
11       str[e] = temp;
12       
13       //Hypothesis
14       recReverse(str, s + 1, e - 1);
15
16    }
17
18    public void reverseString(char[] s) {
19        int n = s.length;
20        recReverse(s, 0, n - 1);
21    }
22}