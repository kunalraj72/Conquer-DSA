// Last updated: 16/10/2025, 04:26:37
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int rem = 0;
        HashMap<Integer, Integer> remInd = new HashMap<>();
        remInd.put(0, -1); //<rem, ind>
        for(int i=0;i<n;i++){
            sum += nums[i];
            
            if(k!=0) {
                 rem = sum %k;
            }
            if(rem<0){ 
                rem += k; // k * n - y = k * n' + (k - y)
            }
            if(remInd.containsKey(rem)){
                if(i - remInd.get(rem) >= 2){
                    return true;
                }
            }
            
            remInd.putIfAbsent(rem, i);
        }
        return false;
    }
}