// Last updated: 14/07/2026, 04:52:19
1class Solution {
2
3    boolean matched(char ch, char top){
4        if(top == '{' && ch == '}' || top=='(' && ch == ')' || top == '[' && ch == ']' ){
5            return true;
6        }
7        else{
8            return false;
9        }
10    }
11
12    public boolean isValid(String s) {
13
14        Stack<Character> st = new Stack<>();
15        for(char c : s.toCharArray()){
16            if(c == '[' || c == '(' || c == '{'){
17                st.push(c);
18            }
19            else{
20                if(!st.empty() && matched(c, st.peek())){
21                    st.pop();
22                }else{
23                    //agar opening-closing braces match naa hua ya fir 
24                    //closing braces opening braces se pehle aa jaye
25                    return false;  
26                }
27            }
28        }
29        if(!st.empty()){
30            return false;
31        }else{
32            return true;
33        }
34    }
35}