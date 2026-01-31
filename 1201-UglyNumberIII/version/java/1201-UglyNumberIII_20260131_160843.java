// Last updated: 31/01/2026, 16:08:43
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
25    //n(A) = count of number divisible by a.
26    //How many integers ≤ num(mid) are divisible by a?
27    //a, 2a, 3a, 4a, .......
28    //The largest multiple of a ≤ num is: ⌊num / a⌋ × a
29    //So the count is simply: num / a
30
31    private long count(long num, int a, int b, int c,
32                       long ab, long bc, long ac, long abc) {
33        return num / a + num / b + num / c      
34             - num / ab - num / bc - num / ac    
35             + num / abc;
36    }
37
38    //Long Division Method (Euclids Algorithm) - jab tak remainder 0 nhi aa jaye tab tak
39    //bade number ko chote se divide karo and at each step remainder becomes new divisor and 
40    //old divisor become dividend. jab mera remainder zero aa jaye tab jo bhi divisor hoga
41    //that will be the GCD. (Watch Luv channel).
42    private long gcd(long x, long y){
43        while(y != 0){
44            long temp = y;
45            y = x % y;
46            x = temp;
47        }
48        return x;
49    }
50
51     private long lcm(long x, long y) {
52        return x * y / gcd(x,y);
53    }
54}