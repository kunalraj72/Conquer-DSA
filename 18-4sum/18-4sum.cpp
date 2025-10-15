// Last updated: 16/10/2025, 04:31:28
class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& arr, int k) {
        int n = arr.size();
        sort(arr.begin(),arr.end());
        set<vector<int>>st;
        for(int i=0;i<n-3;i++){
            int val = k - arr[i];
            for(int j=i+1;j<n-2;j++){
                long long int target = (long long int)val - (long long int)arr[j];
                int l = j+1;
                int r = n-1;
                while(l < r){
                    long long int sum = (long long int)arr[l]+ (long long int)arr[r];
                if(sum == target){
                        st.insert({arr[i],arr[j],arr[l],arr[r]});
                    l++;
                    r--;
                }
                else if(sum < target) l++;
                else if(sum > target) r--;
                }
            }
        }
        vector<vector<int>> ans;
        for(auto it : st){
            ans.push_back(it);
        }
        return ans;
    }
};