// Last updated: 16/10/2025, 04:27:21
class Solution {
public:
    
    
    void reverseString(vector<char>& s) {
        stack<int>st;
        for(int i=0; i<s.size(); i++){
            st.push(s[i]);
        }
        int count = 0;
        while(count<s.size()){
             s[count] = st.top();
             st.pop();
            count++;
        }
    }
};