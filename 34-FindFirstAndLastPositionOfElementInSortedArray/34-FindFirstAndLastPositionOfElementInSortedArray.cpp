// Last updated: 16/10/2025, 04:30:59
class Solution {
public:
    vector<int> searchRange(vector<int>& arr, int x) {
        int n = arr.size();
        int s = 0;
        int e = n-1;
        int mid = (s + e)/2;
        int first = -1;
        int last = -1;
        while(s <= e){
            if(arr[mid] == x){
                first = mid;
                e = mid - 1;
            }
            else if(arr[mid] > x){
                e = mid - 1;
            } 
            
            else if(arr[mid] < x){
                s = mid + 1;
            } 
            
            mid = (s + e)/2;
        }
        if(first == -1) return {-1,-1}; //first hi nahi mila toh last ghanta milega
        if(arr[n-1] == arr[first]) return {first,n-1}; // Edge case: last occurrence agar 
                                                   //last tak jayega, since arr is sorted.
        s = 0;
        e = n-1;
        mid = (s + e)/2;
        while(s <= e){
            if(arr[mid] == x){
                last = mid;
                s = mid + 1;
            }
            else if(arr[mid] > x){
                e = mid - 1;
            } 
            
            else if(arr[mid] < x){
                s = mid + 1;
            } 
            
            mid = (s + e)/2;
        }
        return {first,last};
    }
};