// Last updated: 16/10/2025, 04:27:53
class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n <= 0) return false;
        return ((n & (n-1)) == 0);
    }
};