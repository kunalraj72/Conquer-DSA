// Last updated: 16/10/2025, 04:24:00
class Solution {
public:
    
    int maxSum(vector<int>& nums) {
        int n = nums.size();
        int maxSum = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                string a = to_string(nums[i]);
                string b = to_string(nums[j]);
                char ma = a[0];
                char mb = b[0];
                for(auto it : a){
                    if(it - '0' > ma - '0'){
                        ma = it;
                    }
                }
                for(auto it : b){
                    if(it - '0' > mb - '0'){
                        mb = it;
                    }
                }
                if(ma == mb){
                    maxSum = max(maxSum,nums[i]+nums[j]);
                }
            }
        }
        
        return maxSum;
    }
};