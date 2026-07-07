// Last updated: 08/07/2026, 01:46:49
1class Solution {
2    public int lastStoneWeight(int[] stones) {
3        int n = stones.length;
4        if(n == 1) return stones[0];
5        Deque<Integer> st = new ArrayDeque<>();
6        Arrays.sort(stones);
7        for(int i = 0; i < n; i++){
8            st.push(stones[i]);
9        }
10        while(st.size() > 1){
11            int s1 = st.pop();
12            int s2 = st.pop();
13            int newStone = Math.abs(s1 - s2);
14
15            insert(st, newStone);
16        }
17        return st.size() == 0 ? 0 : st.pop();
18    }
19
20    public void insert(Deque<Integer> st, int stone){
21        
22        //base condition
23        if(st.isEmpty() || stone >= st.peek()){
24            st.push(stone);
25            return;
26        }
27
28        if(stone < st.peek()){
29            int temp = st.pop();
30            insert(st, stone);
31            st.push(temp);
32        }
33    }
34
35}