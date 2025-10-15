// Last updated: 16/10/2025, 04:27:04
//Video Link : https://www.youtube.com/watch?v=dqHw4vOwXn8

class Solution {
public:
    string removeKdigits(string num, int k) {
        int n=num.length();
        if(k == 0) return num;
        if(k >= n) return "0";
        stack<char> st;

        for(int i=0;i<n;i++){

            char c=num[i];

            while(!st.empty() && c<st.top() && k>0){
                st.pop(); k--;
            }

             st.push(c);

        }
        
        if(k>0){   // To handle the case when all digits are in ascending order.
            for(int i=0;i<k; i++){
              st.pop();
            }
        }
        

        if(st.empty()) return "0";

        string ans="";

        while(!st.empty()){

            char ss=st.top();

            st.pop();

            ans += ss;

        }
        reverse(ans.begin(),ans.end());
        
        string s3 = "";
        
        while(ans.size() >0 && ans[0] == '0'){
            ans.erase(0,1);
        }
        if(ans.empty()){
            return "0";
        }
        return ans;
    }
};