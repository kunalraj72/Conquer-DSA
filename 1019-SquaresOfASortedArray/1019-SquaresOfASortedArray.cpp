// Last updated: 16/10/2025, 04:25:24
class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n=nums.size();
        vector<int> result(n);
        int l = 0, r = n-1;
        for(int i=n-1;i>=0;i--){
            
            if(abs(nums[l])>abs(nums[r])){
                result[i] = nums[l]*nums[l];
                l++;
            }
            else{
                result[i] = nums[r]*nums[r];
                r--;
            }
            
        }
         return result;
    }
};
 