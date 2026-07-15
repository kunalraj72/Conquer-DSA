// Last updated: 16/07/2026, 03:16:48
1class Solution {
2    public int findKthLargest(int[] nums, int k) {
3        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
4        int n = nums.length;
5        int i = 0;
6
7        while(i < n){
8            minHeap.offer(nums[i]);
9            if(minHeap.size() > k){
10                minHeap.poll();
11            }
12            i++;
13        }
14        return minHeap.peek();
15    }
16}