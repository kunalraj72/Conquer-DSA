// Last updated: 16/10/2025, 04:23:45
class Solution {
public:
    int sumIndicesWithKSetBits(vector<int>& nums, int k) {
        int n = nums.size();
        int ans = 0;
        for(int i=0;i<n;i++){
            int cnt = 0;
            int j = i;
            while(j > 0){
                if(j % 2  == 1){
                    cnt++;
                }
                j /= 2;
            }
            if(cnt == k){
                ans += nums[i];
            }
        }
        return ans;
    }
};