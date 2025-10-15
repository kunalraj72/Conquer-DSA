// Last updated: 16/10/2025, 04:26:34
class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int maxLen = 0;
        int sum = 0;
        HashMap<Integer,Integer> prefSum = new HashMap<>();
        prefSum.put(0, - 1);
//changing 0 to -1 in arr so that problem becomes largest subarray with sum = 0
        for(int i = 0; i < n; i++){

            int op = nums[i] == 1 ? 1 : -1;
            sum += op;
            
            if(prefSum.containsKey(sum)){ // if cur sum already came before, it means SUM(prefSum.get(sum) + 1, i) = 0
                maxLen = Math.max(i - (prefSum.get(sum) + 1) + 1, maxLen);
            }
            else{
                prefSum.put(sum, i);
            }
        }
        return maxLen;
    }
}