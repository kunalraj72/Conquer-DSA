// Last updated: 16/10/2025, 04:28:16
class Solution {
public:
    int rob(vector<int>& nums) {
        int n = nums.size();
        int  prev = nums[0];
        int  prev2 = 0;
      for(int i=0;i<n;i++){
        int  pick = nums[i];
        if(i>1) pick += prev2;
        int nonPick = prev;
        int curi = max(pick,nonPick);
        prev2 = prev;
        prev = curi;
    }
    return prev;
    }
};