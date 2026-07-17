// Last updated: 18/07/2026, 03:20:03
1class MyStack {
2
3    Queue<Integer> q1 = new LinkedList<>();
4    Queue<Integer> q2 = new LinkedList<>();
5
6    public MyStack() {
7        
8    }
9    
10    public void push(int x) {
11        while(!q1.isEmpty()){
12            q2.offer(q1.poll());
13        }
14        q1.offer(x);
15        while(!q2.isEmpty()){
16            q1.offer(q2.poll());
17        }
18    }
19    
20    public int pop() {
21        if(q1.size() == 0){
22            return -1;
23        }    
24        int val = q1.poll();
25        return val;
26    }
27    
28    public int top() {
29        return q1.peek();
30    }
31    
32    public boolean empty() {
33        return q1.isEmpty() == true;
34    }
35}
36
37/**
38 * Your MyStack object will be instantiated and called as such:
39 * MyStack obj = new MyStack();
40 * obj.push(x);
41 * int param_2 = obj.pop();
42 * int param_3 = obj.top();
43 * boolean param_4 = obj.empty();
44 */