// Last updated: 02/06/2026, 10:33:26
1class Solution {
2    public int fib(int n) {
3
4        if(n <= 1) return n;
5        
6        int fib_n = fib(n - 1) + fib(n - 2);
7        return fib_n;
8    }
9}