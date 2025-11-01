// Last updated: 02/11/2025, 02:59:51
class Solution {
    public int nthUglyNumber(int n) {
        
        PriorityQueue<Long> pq = new PriorityQueue<>(); //minheap to get the smallest number
        HashSet<Long> set = new HashSet<>(); //set to check for duplicates
         
        pq.offer(1L);
        set.add(1L);
        
        long ugly = 1;
        
        for(int i = 1; i <= n; i++){
            ugly = pq.poll();
            
            long num2 = ugly * 2;
            long num3 = ugly * 3;
            long num5 = ugly * 5;
            
            if(!set.contains(num2)){
                set.add(num2);
                pq.offer(num2);
            }
            
            if(!set.contains(num3)){
                set.add(num3);
                pq.offer(num3);
            }
            
            if(!set.contains(num5)){
                set.add(num5);
                pq.offer(num5);
            }
        }
        
        return (int) ugly;
    }
}

//Note: We can use TreeSet Also here because it is sorted and no duplicated allowed.