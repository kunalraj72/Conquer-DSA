// Last updated: 16/10/2025, 04:26:09
class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        
        int s=0,e=0,prod = 1,count = 0;
        int n = nums.size();
         while(e<n){
             prod *= nums[e];
             //if the product value increases k ,then decrease
             while(prod>=k && s<n){
                 prod /= nums[s];
                 s++;
             }
             if(prod<k){
                 count += e-s+1;
             }
             e++;
         }
        return count;
    }
};