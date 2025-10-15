// Last updated: 16/10/2025, 04:31:22
class Solution {
public:
    
    
    bool matched(char ch, char top){
        if(ch == '}' && top == '{' || ch == ')' && top=='(' || ch == ']' && top == '[' ){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    bool isValid(string s) {
      int n = s.size();
      stack<char> st;
        for(auto it : s){
            if(it == '(' || it == '{' || it == '['){
                st.push(it);
            }else{
                if(!st.empty()){
                    if(matched(it,st.top())){
                        st.pop();
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(!st.empty()){
            return false;
        }
        else{
            return true;
        }
    }
};