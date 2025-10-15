// Last updated: 16/10/2025, 04:25:15
//Video Link: https://www.youtube.com/watch?v=TAMLsfGiyOg

class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int start = 0;
        int maxCons1 = 0;
        int zeroCnt = 0;
        int n = nums.size();
        for(int end=0;end<n;end++){
            if(nums[end] == 0){
                zeroCnt++;
            }
            while(zeroCnt > k){
                if(nums[start] == 0){
                    zeroCnt--;
                }
                start++;
            }
            maxCons1 = max(maxCons1,end-start+1);
        }
        return maxCons1;
    }
};