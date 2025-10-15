// Last updated: 16/10/2025, 04:28:51
class Solution {
public:
    int findMin(vector<int>& arr) {
        int n = arr.size();
        int s = 0;
        int e = n-1;
        int mid = (s + e)/2;
        
        while(s < e){
            if(arr[0] < arr[n-1]){
                return arr[0];
            }
            if(mid > 0 && arr[mid] < arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid] >= arr[0]){
                s = mid + 1;
            }
            else{
                e = mid;
            }
            
            mid = (s + e)/2;
        }
        //If last element is the sortest element
        return arr[e];
    }
};