// Last updated: 21/11/2025, 09:16:03
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long [] prefSum = new long[n + 1];
        prefSum[0] = 0;
        Deque<Integer> dq = new LinkedList<>();
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            prefSum[i + 1] = prefSum[i] + nums[i];
        }

        int r = 0;
        // prefSum[r] - prefSum[l] >= r
        while(r <= n){
            //Maintain monotonic increasing deque ( Because we want to minimize prefSum[l])
            while(!dq.isEmpty() && prefSum[r] <= prefSum[dq.peekLast()]){
                dq.pollLast();
            }

            //add element to the last of deque
            dq.offerLast(r);

            //Check if we have valid window and calculate ans
            if(prefSum[r] - prefSum[dq.peekFirst()] >= k){
                while(!dq.isEmpty() && prefSum[r] - prefSum[dq.peekFirst()] >= k){
                    ans = Math.min(ans, r - dq.peekFirst());
                    dq.pollFirst();
                }
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
