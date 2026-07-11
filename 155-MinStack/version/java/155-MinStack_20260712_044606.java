// Last updated: 12/07/2026, 04:46:06
1class MinStack {
2    Stack<Integer> st = new Stack<Integer>();
3    Stack<Integer> minStack = new Stack<Integer>();
4
5    public MinStack() {
6        
7    }
8    
9    public void push(int val) {
10        st.push(val);
11        if(minStack.empty() || (!minStack.empty() && val <= minStack.peek())){
12            minStack.push(val);
13        }
14    }
15    
16    public void pop() {
17        int popped = st.pop();
18        if(popped == minStack.peek()){
19            minStack.pop();
20        }
21    }
22    
23    public int top() {
24        return st.peek();
25    }
26    
27    public int getMin() {
28        return minStack.peek();
29    }
30}
31
32/**
33 * Your MinStack object will be instantiated and called as such:
34 * MinStack obj = new MinStack();
35 * obj.push(val);
36 * obj.pop();
37 * int param_3 = obj.top();
38 * int param_4 = obj.getMin();
39 */