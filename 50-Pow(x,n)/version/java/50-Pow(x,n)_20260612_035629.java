// Last updated: 12/06/2026, 03:56:29
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
20        if(x > 0d && n == -2147483648) return 0d;
21        if(x < 0d && n == -2147483648) return 0d;
22        long abs_n = Math.abs(n);
23        double result = helper(x, abs_n);
24        if(n < 0){
25            result = 1d/result;
26        }
27        return result;
28    }
29};