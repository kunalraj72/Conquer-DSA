// Last updated: 16/10/2025, 04:25:13
class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<Character>();
        String res = "";
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '('){
                if(!st.empty()){
                    res += s.charAt(i);
                }
                st.push(s.charAt(i));
            }else{
                st.pop();
                if(!st.empty()){
                    res += s.charAt(i);
                }
            }
        }
        return res;
    }
}