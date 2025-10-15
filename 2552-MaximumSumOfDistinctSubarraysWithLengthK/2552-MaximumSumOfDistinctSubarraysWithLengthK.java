// Last updated: 16/10/2025, 04:24:27
class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int n = arr.length;
        long maxSum = 0; // Initialize maxSum to 0
        long sum = 0; // Use long for the sum to handle larger values
        int i = 0; // Window start
        int j = 0; // Window end
        HashSet<Integer> s = new HashSet<>();
        
        while (j < n) {
            if(!s.contains(arr[j])){
               sum += arr[j];
               s.add(arr[j]);
            
               if (j - i + 1 < k) {
                   j++;
               }else if (j - i + 1 == k && s.size() == k) {
                   maxSum = Math.max(maxSum, sum);
                   sum -= arr[i];
                   j++;
                   s.remove(arr[i]);
                   i++;
               }
            }else{
                sum -= arr[i];
                s.remove(arr[i]);
                i++;
            }

        }
        
        return maxSum;
    }
}
