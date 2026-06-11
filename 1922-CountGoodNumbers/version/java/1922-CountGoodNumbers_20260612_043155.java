// Last updated: 12/06/2026, 04:31:55
1class Solution {
2    //Watch CodeWithMik's Binomial Exponentiation video to understand the recursive function.
3
4    long MOD = 1_000_000_007; //'_' representing ',' [optional]
5
6    long power(long a, long b){
7        if(b == 0){
8            return 1;
9        }
10
11        long half = power(a, b/2);
12        long result = (half * half) % MOD;
13
14        if(b % 2 == 1){
15            result = (result * a) % MOD;
16        }
17        
18        return result;
19    }
20
21    public int countGoodNumbers(long n) {
22        long noOfEvenPlaces = (n + 1)/2;
23        long noOfOddPlaces = n/2;
24
25        long totalCombinations = (power(5, noOfEvenPlaces) * power(4, noOfOddPlaces)) % MOD;
26
27        return (int) totalCombinations;
28    }
29}