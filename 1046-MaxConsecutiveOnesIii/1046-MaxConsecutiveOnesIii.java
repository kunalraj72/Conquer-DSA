// Last updated: 01/11/2025, 09:17:44
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        int flip = 0;
        while(j < n){
            if(nums[j] == 0){
                flip++;
            }
            if(flip > k){
                while(flip > k){
                    if(nums[i] == 0){
                        flip--;
                    }
                    i++;
                }
            }
            cnt = Math.max(cnt, j - i + 1);
            j++;
        }
        return cnt;
    }
}