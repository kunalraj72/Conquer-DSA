// Last updated: 26/10/2025, 10:14:25
class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long score = 0;
        long [] temp = new long[n];
        for(int i = 0; i < n; i++){
            temp[i] = (long) (nums[i] * nums[i]);
        }
        Arrays.sort(temp);

        for(int i = 0; i < n; i++){
                if(i < (int) Math.ceil(((double)n)/2)){ // i < n - n/2
                   score += temp[n - 1 - i];
                }else{
                   score -= temp[n - 1 - i];
                }
        }
        return score;
    }
}