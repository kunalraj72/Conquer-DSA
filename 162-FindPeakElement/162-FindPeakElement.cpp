// Last updated: 16/10/2025, 04:28:43
class Solution {
public:
    int findPeakElement(vector<int>& arr) {
       int n =arr.size();
       int start = 0;
       int end = n-1;
       int mid = (start + end)/2;
       
       while(start < end){
           //if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid-1]) return mid;
           
           if(arr[mid] < arr[mid+1]){
               start = mid + 1;
           }
           else {
               end = mid;
           }
           mid = start + (end-start)/2;
       }
       return start;
    }
};