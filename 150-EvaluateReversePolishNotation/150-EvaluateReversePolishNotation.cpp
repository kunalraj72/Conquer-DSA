// Last updated: 16/10/2025, 04:28:48
#include<string>
class Solution {
public:
    int evalRPN(vector<string>& ch) {
        stack<int> st;
        for(int i=0;i<ch.size();i++){
            if(ch[i] == "*" || ch[i] == "+" || ch[i] == "-" || ch[i] == "/"){
                int op1 = st.top();
                st.pop();
                int op2 = st.top();
                st.pop();
                int ans;
                
                if(ch[i] == "*"){
                    ans = op2 * op1;
                }
                else if(ch[i] == "/"){
                    ans = op2 / op1;
                }
                else if(ch[i] == "+"){
                    ans = op2 + op1;
                }
                else if(ch[i] == "-"){
                    ans = op2 - op1;
                }
                st.push(ans);
            }
            else{
                st.push(stoi(ch[i]));
            }
        }
        return st.top();
    }
};