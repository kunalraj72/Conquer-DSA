// Last updated: 16/10/2025, 04:25:07
//Video: https://www.youtube.com/watch?v=atUJS7ArOY0

class Solution {
public:
    int numberOfSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        int sum = 0;
        int count = 0;
        unordered_map<int,int> prefSum;
        for(int i=0;i<n;i++){
            if(nums[i]%2 == 0){
                nums[i] = 0;
            }else{
                nums[i] = 1;
            }
        }
        
       for(int i=0;i<n;i++){
           sum += nums[i];
           if(sum == k){
               count++;
           }
           int b = sum -k;
           if(prefSum.find(b) != prefSum.end()){
               count += prefSum[b];
           }
           prefSum[sum] ++;
       }
        return count;
    }
};