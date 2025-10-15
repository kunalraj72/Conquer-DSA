// Last updated: 16/10/2025, 04:25:27
class Solution {
public:
    int minFallingPathSum(vector<vector<int>>& matrix) {
        int n = matrix.size(), m = matrix[0].size();
        vector<vector<int>> dp(n,vector<int> (m,0));
        
        for(int j=0;j<m;j++){
            dp[0][j] = matrix[0][j];
        }
        for(int i=1;i<n;i++){
                int ld = 1e9;
                int rd = 1e9;  
            for(int j=0;j<m;j++){
                
                int s = matrix[i][j] + dp[i-1][j];
              if(j-1 >= 0)  ld = matrix[i][j] + dp[i-1][j-1];
              if(j+1<m) rd = matrix[i][j] + dp[i-1][j+1];
            
                dp[i][j] = min(s,min(ld,rd));
            }
        }
    int mini = dp[n-1][0];
    
    for( int j=1;j<m;j++){
            mini = min(mini,dp[n-1][j]);
        }
         return mini;
    }  
};