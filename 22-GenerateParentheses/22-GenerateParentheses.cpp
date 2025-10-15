// Last updated: 16/10/2025, 04:31:24
class Solution {
public:
    
     void helper(string str, int open, int close, vector<string> &ans, int n){
        if(open == n && close == n){
            ans.push_back(str);
            return;
        }
        if(open > n){
            return;
        }
        helper(str + "(", open+1, close, ans, n);
        
        if(open > close){
            helper(str + ")", open, close+1, ans, n);
        }
    }
    
    vector<string> generateParenthesis(int n) 
    {
        vector<string> ans;
        helper("",0,0,ans,n);
        return ans;
    }
};