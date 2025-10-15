// Last updated: 16/10/2025, 04:24:31
class Solution {
public:
    
    int countSetBits(int n){
        int count = 0;
        while(n>0){
            //Check previous 2 solution also
             //******** Using Brian Kernughans Algo************
             
             n = n & (n-1);  
             count++;
        }
        return count;
    }
    
    
    int minBitFlips(int start, int goal) {
         int ans = start ^ goal;  // different bit ko 1 set kar dega(GFG video solution)
        return countSetBits(ans);
    }
};