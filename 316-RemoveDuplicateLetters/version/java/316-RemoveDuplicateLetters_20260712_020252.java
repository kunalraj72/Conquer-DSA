// Last updated: 12/07/2026, 02:02:52
1class Solution {
2    //Brute Force: Using BackTracking
3    public String removeDuplicateLetters(String s) {
4        Stack<Character> st = new Stack<>();
5        int[] freq = new int[26];
6        boolean[] seen = new boolean[26];
7        Arrays.fill(seen, false);
8        for(char c : s.toCharArray()) freq[c-'a']++;
9
10        for(char c : s.toCharArray()){
11            freq[c-'a']--;
12
13            if(seen[c-'a']) continue;
14
15            if(st.empty()){
16                st.push(c);
17            }else if(c > st.peek()){
18                st.push(c);
19            }else{
20                while(!st.empty() && c < st.peek() && freq[st.peek() - 'a'] > 0){
21                    seen[st.peek() - 'a'] = false;
22                    st.pop();
23                }
24                st.push(c);
25                
26            }
27            seen[c - 'a'] = true;
28        }
29
30        StringBuilder sb = new StringBuilder();
31        while(!st.isEmpty()) sb.append(st.pop());
32
33        return sb.reverse().toString();
34    }
35}
36
37//reference: Techdose video