// Last updated: 16/10/2025, 04:28:07
class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int ans = INT_MAX;
        int n = nums.size();
        //unordered_map<int,int> mp;
        int s=0,e=0;
        int sum = 0;
        while(e<n){
           sum += nums[e];
            while(sum>=target){
                ans = min(ans,e-s+1);
                sum -= nums[s];
                s++;
            }
             e++;
        }
        if(ans == INT_MAX) return 0;
        
        return ans;
    }
};



// sum+=nums[j++];
//             while(sum>=target){
//                 ans=min(ans, j-i);
//                 sum-=nums[i++];
//             }