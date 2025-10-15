// Last updated: 16/10/2025, 04:26:35
class Solution {
public:
    int singleNonDuplicate(vector<int>& arr) {
        int n = arr.size();
        int xorr = 0;
        for(int i=0;i<n;i++){
            xorr ^= arr[i];
        }
        return xorr;
    }
};