// Last updated: 16/10/2025, 04:25:08
class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        long l = 1, r = (long)2e9; // search space
        long ab = lcm(a, b);
        long bc = lcm(b, c);
        long ac = lcm(a, c);
        long abc = lcm(ab, c);

        while(l < r){
            long mid = l + (r - l)/2;

            long count = count(mid, a, b, c, ab, bc, ac, abc);
            if(count < n){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        return (int) l | (int) r;
    }

     //Inclusion-Exclusion Principle (Venn Diagram)
    // n(A ∪ B ∪ C) = n(A) + n(B) + n(C) - n(A ∩ B) - n(B ∩ C) - n(C ∩ A) + n(A ∩ B ∩ C)
    private long count(long num, int a, int b, int c,
                       long ab, long bc, long ac, long abc) {
        return num / a + num / b + num / c      
             - num / ab - num / bc - num / ac    
             + num / abc;
    }

    private long gcd(long x, long y){
        while(y != 0){
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

     private long lcm(long x, long y) {
        return x / gcd(x, y) * y;
    }
}