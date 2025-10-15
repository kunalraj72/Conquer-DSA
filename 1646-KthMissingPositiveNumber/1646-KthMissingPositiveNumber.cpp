// Last updated: 16/10/2025, 04:24:57
class Solution {
public:
    //Video: https://www.youtube.com/watch?v=tcjjJBJw1rM
    int findKthPositive(vector<int>& a, int k) {
    int n = a.size();
    int low = 0;
    int high = n;
    while(low < high){
        int mid = (low+high)/2;
        if(a[mid] - (mid + 1)  >= k){
            high = mid;
        }
        else{
            low = mid + 1;
        }
    }
    return  low + k;
    }
};