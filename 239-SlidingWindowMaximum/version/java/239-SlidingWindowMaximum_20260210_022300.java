// Last updated: 10/02/2026, 02:23:00
1class Solution {
2    public int[] maxSlidingWindow(int[] nums, int k) {
3        int n = nums.length;
4        int i = 0; // Window start
5        int j = 0; // Window end
6        Deque<Integer> dq = new LinkedList<>(); //Deque:[First     Last]
7
8        //Why Deque? 
9        //because queue will only remove the element from front but to maintain the monotonic decreasing order,
10        //and for that we need to remove the element from the front as well when dq.peekLast() < nums[j] 
11        //condition hits. And Deque supports all the required function, i.e, pollFirst(), pollLast(), 
12        // offerLast(), peekFirst(), peekLast() and abvoiusly isEmpty().
13        
14        int ans[] = new int[n-k+1];
15        
16        while (j < n) {
17            
18            while(!dq.isEmpty() && dq.peekLast() < nums[j]){
19                dq.pollLast();  
20            }
21            dq.offerLast(nums[j]); 
22            
23            if (j - i + 1 < k) {
24                j++;
25            }else if (j - i + 1 == k) {
26                ans[i] = dq.peekFirst();
27                //since we need to increase i to move the window forward, we have to first check if
28                // nums[i] == dq.peekFirst(), if yes then we need to remove it from the Deque before moving 
29                // the window forward.
30                if(nums[i] == dq.peekFirst()){ 
31                    dq.pollFirst();
32                }
33                i++;
34                j++;
35            }
36                
37        }
38       return ans;
39    }
40}
41
42//Note:
43//Hamesha aisa socho ki hame queue/Deque k first(front) se hi pop karna hai, so based on this we can decide whether we need monotonic increasing or monotonic decreasing queue/deque.
44//For ex. in this problem, we need to calculate maximum, so we need to maintain monotonic decreasing deque so that  q/dq ka first element hamesha maximum ho 