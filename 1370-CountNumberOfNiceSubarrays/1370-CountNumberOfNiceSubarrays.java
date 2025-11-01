// Last updated: 01/11/2025, 09:17:42
class Solution {

    public int compareLessThanEqualTo(int[] nums, int k){
        int n = nums.length;
        int i = 0;
        int j = 0;
        int cnt = 0;
        int sum = 0;

        while(j < n){
            sum += nums[j];

            if(sum > k){
                while(sum > k && i <= j){
                    sum -= nums[i];
                    i++;
                }
            }
            //we r counting subarray with sum <= k becoz 
            //Count(subarrays with sum == k) = Count(subarrays with sum ≤ k) − 
            //Count(subarrays with sum ≤ k−1)
            if(sum <= k){ 
                cnt += j - i + 1;
            }
            j++;
        }
        return cnt;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (nums[i] % 2 == 1) ? 1 : 0;
        }

        return compareLessThanEqualTo(nums, k) - compareLessThanEqualTo(nums, k - 1);
    }
}