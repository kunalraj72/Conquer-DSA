// Last updated: 16/10/2025, 04:30:43
class Solution {
public:
    int jump(vector<int>& nums) {
        int n = nums.size();
        if(n == 1){
            return 0;
        }
        int ans = 1; // if n > 1 , then output must be atleast 1.
        int ind = 0;
        int start = ind + 1;
        
        while(true){
            if(ind + nums[ind] >= (n-1)){
                return ans;
            }
            int maxi = 0;
            int max_ind = 0;
            while(start <= ind + nums[ind]){
                if(start + nums[start] > maxi){
                    maxi = start + nums[start];
                    max_ind = start;
                }
                 start++;
            }
            ans++;
            ind = max_ind;
            start = ind + 1;
        }
        return ans;
    }
};