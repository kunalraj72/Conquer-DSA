// Last updated: 16/10/2025, 04:30:17
class Solution {
public:
    
     int f(int i, int j, vector<vector<int>> &dp, vector<vector<int>> &grid){
        
        
        if(i <0 || j < 0 ) return 0;
        if(grid[i][j] == 1) return 0;
        if(i == 0 && j == 0) return 1;       
         
        if(dp[i][j] != -1) return dp[i][j];
        int up = f(i-1,j,dp,grid);
        int left = f(i,j-1,dp,grid);
        
        return dp[i][j] = up + left;
    }
    
    
    
    
    
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int m = obstacleGrid.size(), n = obstacleGrid[0].size();
         if(obstacleGrid[m-1][n-1]==1) return 0;
        vector<vector<int>> dp(m,vector<int>(n,-1));
        return f(m-1,n-1,dp,obstacleGrid);
    }
};