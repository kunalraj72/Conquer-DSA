// Last updated: 16/10/2025, 04:28:09
class Solution {
    //Sieve of Eratosthenes.
    public int countPrimes(int n) {
        int cnt = 0;
        if (n < 2) return 0;
        boolean [] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i = 2; i*i <= n; i++){
            if(isPrime[i]){
                for(int j = i * i ; j < n; j += i ){ 
                    isPrime[j] = false;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(isPrime[i]){
                cnt++;
            }
        }
        return cnt;
    }
}
// n*Sqrt(n) = 10^9 > 10^8(in 1s) - My approach - TLE
// nloglogn = ~ 5*10^6  < 10^8 (sieve approach) - Pass

// Why not inner loop start from 2 * i?
// Suppose you’re at prime i = 5.

// Its multiples are: 10, 15, 20, 25, 30 …

// But wait:

// 10 = 2 * 5 → already marked by i = 2

// 15 = 3 * 5 → already marked by i = 3

// 20 = 4 * 5 → already marked by i = 2

// So all multiples less than i² were already marked by smaller primes.