// Last updated: 15/07/2026, 03:25:04
1class MyStack {
2
3    private Queue<Integer> queue;
4    private int top;
5
6    public MyStack() {
7        queue = new LinkedList<>();
8        top = 0;
9    }
10    
11    public void push(int x) {
12        queue.offer(x);
13        top = x;
14    }
15    
16    public int pop() {
17        int size = queue.size();
18        for(int i = 1; i < size; i++){
19            if(i == size - 1) top = queue.peek();
20            queue.offer(queue.poll()); 
21        }
22        return queue.poll();
23    }
24    
25    public int top() {
26        return top;
27    }
28    
29    public boolean empty() {
30        return queue.isEmpty();
31    }
32}
33
34/**
35 * Your MyStack object will be instantiated and called as such:
36 * MyStack obj = new MyStack();
37 * obj.push(x);
38 * int param_2 = obj.pop();
39 * int param_3 = obj.top();
40 * boolean param_4 = obj.empty();
41 */