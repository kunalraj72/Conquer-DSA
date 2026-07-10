// Last updated: 10/07/2026, 18:48:34
1class Solution {
2    public String removeKdigits(String num, int k) {
3        int n = num.length();
4        Deque<Character> stack = new ArrayDeque<>();
5        int i = 0;
6        while(i < n){
7            if(stack.isEmpty()){
8                stack.push(num.charAt(i));
9            }else if(num.charAt(i) - 0 >= stack.peek() - 0){
10                stack.push(num.charAt(i));
11            }else{
12                while(!stack.isEmpty() && (num.charAt(i) - 0) < (stack.peek() - 0) && k > 0){
13                    stack.pop();
14                    k--;
15                }
16                stack.push(num.charAt(i));
17            }
18            i++;
19        }
20        while (k > 0) {
21            stack.pop();
22            k--;
23        }
24        StringBuilder sb = new StringBuilder();
25        while(!stack.isEmpty()){
26            sb.append(stack.pop());
27        }
28        String s = sb.reverse().toString();
29        if(s.isEmpty()) return "0";
30        n = s.length();
31        i = 0;
32        //remove leading zeros
33        while(i < n && s.charAt(i) == '0'){ 
34            i++;
35        }
36        if(i == n){ //only zero is present in the string
37            return "0";
38        }
39        s = s.substring(i, n);
40        return s;
41    }
42}