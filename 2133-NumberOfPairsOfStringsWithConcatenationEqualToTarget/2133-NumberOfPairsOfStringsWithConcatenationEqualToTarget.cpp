// Last updated: 16/10/2025, 04:24:41
#include<string.h>
class Solution {
public:
    int numOfPairs(vector<string>& nums, string target) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i != j){
                    string str = nums[i] + nums[j];
                    if(str == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
};