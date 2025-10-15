// Last updated: 16/10/2025, 04:25:10
class Solution {
public:
    int longestCommonSubsequence(string s1, string s2) {
        int x = s1.size();
        int y = s2.size();
        vector<vector<int>> dp(x+1,vector<int>(y+1,0));
        
        for(int i = 0; i<=x; i++){
            dp[i][0] = 0;   //Base Case 
        }
        for(int j =0 ;j<=y; j++){
            dp[0][j] = 0;  //Base Case
        }
        
        for(int i=1;i<=x;i++){
            for(int j=1; j<=y;j++){
                if(s1[i-1] == s2[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }
};