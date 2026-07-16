// Last updated: 17/07/2026, 00:10:55
1class MyQueue {
2
3    Deque<Integer> input, output;
4
5     MyQueue() {
6        input = new ArrayDeque<>();
7        output = new ArrayDeque<>();
8    }
9
10    void push(int x) {
11        input.push(x);
12    }
13    
14    int pop() {
15        while(!input.isEmpty()){
16            output.push(input.pop());
17        }
18        int val = output.pop();
19        while(!output.isEmpty()){
20            input.push(output.pop());
21        }
22        return val;
23    }
24    
25    int peek() {
26        while(!input.isEmpty()){
27            output.push(input.pop());
28        }
29        int val = output.peek();
30        while(!output.isEmpty()){
31            input.push(output.pop());
32        }
33        return val;
34    }
35    
36    public boolean empty() {
37       return input.isEmpty() == true;
38    }
39}
40
41/**
42 * Your MyQueue object will be instantiated and called as such:
43 * MyQueue obj = new MyQueue();
44 * obj.push(x);
45 * int param_2 = obj.pop();
46 * int param_3 = obj.peek();
47 * boolean param_4 = obj.empty();
48 */