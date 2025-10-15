// Last updated: 16/10/2025, 04:25:01
class Solution {
public:
    //Video Link: https://www.youtube.com/watch?v=1DkVU2i3sOA
  
    int maxScore(vector<int> &nums,int k) {
         
         long long sum = 0;
         int n = nums.size();
         for(int i=0;i<k;i++){
             sum += nums[i];
         }
         k--; //To make zero indexing
         n--; //To make zero indexing
         long long maxSum = sum;
         while(k>=0){
             sum -= nums[k];
             sum += nums[n];
             maxSum = max(maxSum, sum);
             k--;
             n--;
         }
         return maxSum;
    }
};