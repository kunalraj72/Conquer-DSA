// Last updated: 16/10/2025, 04:26:46
class Solution {
public:
    int solve(vector<int> &A, int target, int ind){
      if(ind < 0){
          return target == 0;
      }
      
      int minus = solve(A,target-A[ind],ind-1);
      int plus = solve(A,target+A[ind],ind-1);
      return (plus + minus);
  }
  
    int findTargetSumWays(vector<int>& nums, int target) {
        int n = nums.size();
        return solve(nums,target,n-1);
    }
};