// Last updated: 14/07/2026, 04:31:24
1class Solution {
2    public int evalRPN(String[] ch) {
3        int n = ch.length;
4        Deque<Integer> st = new ArrayDeque<>();
5        for(int i = 0; i < n; i++){
6            if (ch[i].equals("*") || ch[i].equals("+") ||
7    ch[i].equals("-") || ch[i].equals("/")){
8                int op1 = st.pop();
9                int op2 = st.pop();
10                int ans = 0;
11                if(ch[i].equals("*")){
12                    ans = op2 * op1;
13                }
14                else if(ch[i].equals("/")){
15                    ans = op2 / op1;
16                }
17                else if(ch[i].equals("+")){
18                    ans = op2 + op1;
19                }
20                else if(ch[i].equals("-")){
21                    ans = op2 - op1;
22                }
23                st.push(ans);
24            }else{
25                st.push(Integer.parseInt(ch[i]));
26            }
27        }
28        return st.peek();
29    }
30}