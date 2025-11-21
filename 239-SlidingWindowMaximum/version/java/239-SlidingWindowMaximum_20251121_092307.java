// Last updated: 21/11/2025, 09:23:07
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int i = 0; // Window start
        int j = 0; // Window end
        Deque<Integer> dq = new LinkedList<>(); //Deque:[First     Last]

        //Why Deque? 
        //because queue will only remove the element from front but to maintain the monotonic decreasing order,
        //and for that we need to remove the element from the front as well when dq.peekLast() < nums[j] 
        //condition hits. And Deque supports all the required function, i.e, pollFirst(), pollLast(), 
        // offerLast(), peekFirst(), peekLast() and abvoiusly isEmpty().
        
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
                //since we need to increase i to move the window forward, we have to first check if
                // nums[i] == dq.peekFirst(), if yes then we need to remove it from the Deque before moving 
                // the window forward.
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

//Note:
//Hamesha aisa socho ki hame queue/Deque k first(front) se hi pop karna hai, so based on this we can decide whether we need monotonic increasing or monotonic decreasing queue/deque.
//For ex. in this problem, we need to calculate maximum, so we need to maintain monotonic decreasing deque so that  q/dq ka first element hamesha maximum ho 