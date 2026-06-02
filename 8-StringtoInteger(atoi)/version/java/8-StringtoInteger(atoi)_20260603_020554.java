// Last updated: 03/06/2026, 02:05:54
1class Solution {
2    public int myAtoi(String s) {
3        int len = s.length();
4        double num = 0; //To avoid overflow condition as num can be greater that Integer.MAX_VALUE
5        if(len == 0) return 0;
6        int i = 0;
7
8        //1. skipping whitespace
9        while(i < len && s.charAt(i) == ' '){
10            i++;
11        }
12        
13        //edge case
14        if(i == len){
15            return 0;
16        }
17
18        //2. sign check
19        boolean positive = s.charAt(i) == '+';
20        boolean negative = s.charAt(i) == '-';
21
22        if(positive == true || negative == true){
23            i++;
24        }
25        //3. skipping leading zeroes
26        while(i < len && s.charAt(i) == '0'){
27            i++;
28        }
29        
30        //Calculation and Rounding
31        while(i < len && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
32            num = num * 10 + s.charAt(i) - '0';
33            i++;
34        }
35
36        num = negative == true ? -num : num;
37        return (int) num;
38    }
39}