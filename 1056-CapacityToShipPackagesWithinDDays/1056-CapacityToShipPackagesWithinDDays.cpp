// Last updated: 16/10/2025, 04:25:11
class Solution {
public:
    bool helper(int mid, vector<int> arr, int N, int D){
        int sum = 0;
        int day = 1;
        for(int i=0;i<N;i++){
            sum += arr[i];
            if(sum > mid){
                day++;
                sum = arr[i];
            }
        }
        if(day<=D) return true;
        else return false;
    }
    
    int shipWithinDays(vector<int>& arr, int D) {
        int N = arr.size();
        int l = *max_element(arr.begin(),arr.end()); //least capacity when D=size of array
        int h = 0; //max Capacity when D = 1
        for(int i=0; i<N; i++){
            h += arr[i];
        }
        int ans = 0;
        
        while(l <= h){
            int mid = (l+h)/2;
            if(helper(mid,arr,N,D)){
                ans = mid;
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return ans;
    }
};