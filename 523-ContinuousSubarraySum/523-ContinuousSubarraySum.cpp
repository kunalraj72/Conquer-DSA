// Last updated: 16/10/2025, 04:26:44
class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        int n = nums.size();
        int sum = 0;
        int start = 0;
        int end = 0;
        int length,rem=0;
        mp[0] = 1;
        for(int i=0;i<n;i++){
            sum += nums[i];
              
            if(k!=0) {
                 rem = sum %k;
            }
             if(i!=0 and rem == 0){
                  return true;
              }
             
            if(rem<0){
                rem += k;
            }
            if(mp.find(rem) != mp.end()){
               start = mp[rem]+1;
               end = i;
               length = end-start+1;
               if(length>=2){
                   return true;
               }
            }
            else{
                mp[rem] = i;
            }
        }
        return false;
    }
};