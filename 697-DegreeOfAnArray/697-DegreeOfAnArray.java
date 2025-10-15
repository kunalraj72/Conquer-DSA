// Last updated: 16/10/2025, 04:26:11
class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        int n = nums.length, res = n, maxFreq = 0;
        
        for(int i=0;i<n;i++){
           if (!left.containsKey(nums[i])) left.put(nums[i], i); // the leftmost index
             freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1); // frequency
            
            if (freq.get(nums[i]) > maxFreq) { // we find a new deepest degree
                maxFreq = freq.get(nums[i]);
                res = i - left.get(nums[i]) + 1;
            } 
            
            else if (freq.get(nums[i]) == maxFreq) { // max degree, and get the shorter length of
                                                     //sub array
                res = Math.min(res, i - left.get(nums[i]) + 1);
            }
        }
        return res;
    }
}


       
       