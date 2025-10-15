// Last updated: 16/10/2025, 04:25:30
class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        int n = nums.size();
        int sum = 0;
        int start = 0;
        int end = 0;
        int count=0,rem=0;
         mp[0] = 1;
        for(int i=0;i<n;i++){
            sum += nums[i];
             
            if(k!=0) {
                 rem = sum %k;
            }
            
            if(rem<0){   //for taking care of -ve rem
                rem+=k;
            }   
            
            if(mp.find(rem) != mp.end()){
                 
                count += mp[rem];
                mp[rem]++;
                
            }
            else{
                mp[rem] = 1;
            }
        }
        return count;

    }
};