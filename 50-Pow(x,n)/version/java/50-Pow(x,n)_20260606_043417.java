// Last updated: 06/06/2026, 04:34:17
1class Solution {
2    double myPow(double x, int n) {
3       if (n == 0) {
4        return 1.0;
5    }
6    double res = 1.0;
7    long p = Math.abs((long) n);
8
9    //if n % 2 == 0 -> x^n = (x * x)^n/2
10    //if n % 2 == 1 -> x^n = x * (x)^n-1
11    //Dry run u will understand or watch striver video on Binary Exponentiation
12    while (p > 0) {
13        if (p % 2 == 0) {
14            x = x * x;
15            p /= 2;
16        }else{
17            res *= x;
18            p--;
19        }
20    }
21    if (n < 0) {
22        return 1.0 / res;
23    } else {
24        return res;
25    }
26 }
27};