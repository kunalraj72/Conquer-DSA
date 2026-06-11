// Last updated: 12/06/2026, 03:58:15
1class Solution {
2    double helper(double x, long n){
3        if (n == 0l) {
4           return 1l;
5       }
6    //if n % 2 == 0 -> x^n = (x * x)^n/2
7    //if n % 2 == 1 -> x^n = x * (x)^n-1
8    //Dry run u will understand or watch striver video on Binary Exponentiation
9    double half = helper(x, n/2);
10    double result = half * half;
11    if(n % 2l == 1l){
12        result = result * x;
13    }
14    return result;
15    }
16
17    double myPow(double x, int n) {
18        if(x == 1d) return 1d;
19        if(x == -1d) return (n%2 == 0)? 1 : -1;
20        if(n == -2147483648) return 0d;
21        long abs_n = Math.abs(n);
22        double result = helper(x, abs_n);
23        if(n < 0){
24            result = 1d/result;
25        }
26        return result;
27    }
28};