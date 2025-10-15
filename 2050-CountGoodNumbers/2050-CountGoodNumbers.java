// Last updated: 16/10/2025, 04:24:44
class Solution {
    //Watch CodeWithMik's Binomial Exponentiation video to understand the recursive function.

    long MOD = 1_000_000_007; //'_' representing ',' [optional]

    long power(long a, long b){
        if(b == 0){
            return 1;
        }

        long half = power(a, b/2);
        long result = (half * half) % MOD;

        if(b % 2 == 1){
            result = (result * a) % MOD;
        }
        
        return result;
    }

    public int countGoodNumbers(long n) {
        long noOfEvenPlaces = (n + 1)/2;
        long noOfOddPlaces = n/2;

        long totalCombinations = (power(5, noOfEvenPlaces) * power(4, noOfOddPlaces)) % MOD;

        return (int) totalCombinations;
    }
}