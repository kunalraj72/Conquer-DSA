// Last updated: 16/10/2025, 04:25:26
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        int rem = 0;
        HashMap<Integer, Integer> remCnt = new HashMap<>(); // we r storing sum % k count this time
        remCnt.put(0, 1); // sum is currently 0 and so rem so putting the count of rem into map.
        for(int i=0;i<n;i++){
            sum += nums[i];

            if(k!=0) {
                 rem = sum % k;
            }
            if(rem<0){ 
                rem += k; // K * n - y = k * n' + (k - y)
            }           
            if(remCnt.containsKey(rem)){
                count += remCnt.get(rem);
            }
            
            remCnt.put(rem, remCnt.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}