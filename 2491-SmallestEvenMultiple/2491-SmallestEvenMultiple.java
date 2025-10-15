// Last updated: 16/10/2025, 04:24:30
class Solution {
    public int smallestEvenMultiple(int n) {

        if(n % 2 == 0){
            return n;
        }
        
        return 2*n;
    }
}