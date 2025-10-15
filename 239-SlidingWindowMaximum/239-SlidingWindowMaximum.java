// Last updated: 16/10/2025, 04:27:38
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int i = 0; // Window start
        int j = 0; // Window end
        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[n-k+1];
        
        while (j < n) {
            
            while(!dq.isEmpty() && dq.peekLast() < nums[j]){
                dq.pollLast();
            }
            dq.offerLast(nums[j]);
            
            if (j - i + 1 < k) {
                j++;
            }else if (j - i + 1 == k) {
                ans[i] = dq.peekFirst();
                if(nums[i] == dq.peekFirst()){
                    dq.pollFirst();
                }
                i++;
                j++;
            }
                
        }
       return ans;
    }
}