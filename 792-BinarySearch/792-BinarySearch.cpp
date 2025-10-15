// Last updated: 16/10/2025, 04:25:58
class Solution {
public:
    int search(vector<int>& arr, int k) {
        int n = arr.size();
        int s = 0;
        int e = n-1;
        int mid = (s + e)/2;
        while(s <= e){
            if(arr[mid] == k) return mid;
            
            else if(arr[mid] > k) e = mid - 1;
            
            else if(arr[mid] < k) s = mid + 1;
            
            mid = (s + e)/2;
        }
        return -1;
    }
};