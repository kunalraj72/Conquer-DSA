// Last updated: 08/07/2026, 02:13:12
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        
4        Queue<Integer> q = new LinkedList<>();
5        int n = tickets.length;
6        for(int i = 0; i < n; i++){
7            q.offer(tickets[i]);
8        }
9
10        int timeTaken = 0;
11        while(!q.isEmpty()){
12            int p = q.poll();
13            p--;
14            timeTaken++;
15            if(p > 0) q.offer(p);
16
17            if(p == 0 && k == 0){
18                break;
19            }
20
21        //Since we removed one from front → everyone SHIFT left logically, 
22        //think of k as a person, if one person buys ticket and moves towards 
23        //the end of queue, the 2nd person becomes 1st, 3rd person becomes 2nd and so on.
24        //Once k becomes negative means kth person has just purchased a ticket 
25        //and moving towards the end of queue forn purchasing next ticket.
26            k--;
27            if(k < 0){
28                k = q.size() - 1;
29            }
30        }
31        return timeTaken;
32    }
33}