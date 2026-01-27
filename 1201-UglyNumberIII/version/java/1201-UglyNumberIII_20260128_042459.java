// Last updated: 28/01/2026, 04:24:59
1class Solution {
2    public int nthUglyNumber(int n, int a, int b, int c) {
3        long l = 1, r = (long)2e9; // search space
4        long ab = lcm(a, b);
5        long bc = lcm(b, c);
6        long ac = lcm(a, c);
7        long abc = lcm(ab, c);
8
9        while(l < r){
10            long mid = l + (r - l)/2;
11
12            //count of ugly number in <= mid
13            long count = count(mid, a, b, c, ab, bc, ac, abc);
14            if(count < n){
15                l = mid + 1;
16            }else{
17                r = mid;
18            }
19        }
20        return (int) l | (int) r;
21    }
22
23    //Inclusion-Exclusion Principle (Venn Diagram)
24    // n(A ∪ B ∪ C) = n(A) + n(B) + n(C) - n(A ∩ B) - n(B ∩ C) - n(C ∩ A) + n(A ∩ B ∩ C)
25    //n(A) = count of number divisible by a. so here suppose num is 12 and a = 2, then 
26    //[2,4,6,8,10,12] all are divisible by 2 so total count of number divisible by 2 = 6 = num/a
27
28    private long count(long num, int a, int b, int c,
29                       long ab, long bc, long ac, long abc) {
30        return num / a + num / b + num / c      
31             - num / ab - num / bc - num / ac    
32             + num / abc;
33    }
34
35    private long gcd(long x, long y){
36        while(y != 0){
37            long temp = y;
38            y = x % y;
39            x = temp;
40        }
41        return x;
42    }
43
44     private long lcm(long x, long y) {
45        return x / gcd(x, y) * y;
46    }
47}