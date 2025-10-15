// Last updated: 16/10/2025, 04:28:55
class Solution {
public:
    string reverseWords(string s) {
        int n = s.length();
        stack<string> st;
        string str1 = "";
        for(int i=0;i<n;i++){
            if(s[i] == ' '){
                if(str1.length() > 0)st.push(str1);
                str1 = "";
                continue;
            }
            str1 += s[i];
            
        }
        if(str1.length() > 0){
            st.push(str1);
        }
        
        
        string res = "";
        while(!st.empty()){
            res += st.top();
            st.pop();
            if(!st.empty()){
                res += ' ';
            } 
        }
        return res;
    }
};