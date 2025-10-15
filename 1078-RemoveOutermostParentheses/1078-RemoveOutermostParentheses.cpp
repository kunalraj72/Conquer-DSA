// Last updated: 16/10/2025, 04:25:17
class Solution {
public:
    string removeOuterParentheses(string s) {
        int n = s.length();
        stack<char> st;
        string res = "";
        for(int i=0;i<n;i++){
            if(s[i] == '('){
                if(!st.empty()){
                    res += s[i];
                }
                st.push(s[i]);
            }
            else{
                st.pop();
                if(!st.empty()){
                    res += s[i];
                }
            }
        }
        return res;
    }
};