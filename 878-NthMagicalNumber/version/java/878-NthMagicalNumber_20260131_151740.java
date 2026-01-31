// Last updated: 31/01/2026, 15:17:40
1class Solution {
2
3    private long gcd(long x, long y){
4        while(y != 0){
5            long temp = y;
6            y = x % y;
7            x = temp;
8        }
9        return x;
10    }
11
12    private long lcm(long x, long y) {
13        return x / gcd(x,y) * y;
14    }
15
16    //Based on Inclusion and Exclusion Principle - Similar to LC 1201 - Ugly No 3
17    public int nthMagicalNumber(int n, int a, int b) {
18        long l = 1, r = (long) n * Math.min(a, b);
19        long ab = lcm(a, b);
20
21        while(l < r){
22            long mid = l + (r - l)/2;
23
24            long count = count(mid, a, b, ab);
25            if(count < n){
26                l = mid + 1;
27            }else{
28                r = mid;
29            }
30        }
31
32        return (int)(l % 1_000_000_007);
33    }
34
35    private long count(long num, int a, int b, long ab) {
36        return num / a + num / b - num / ab;
37    }
38}
39