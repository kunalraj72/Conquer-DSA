// Last updated: 03/06/2026, 01:24:40
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        if(n <= 0) return false; //this is for special case when n == 0, to save from infinite call
4        if(n == 1) return true;
5        if(n % 2 != 0) return false;
6
7        return isPowerOfTwo(n / 2); //2*2*2*2 = n => n/2 = 2*2*2
8    }
9}