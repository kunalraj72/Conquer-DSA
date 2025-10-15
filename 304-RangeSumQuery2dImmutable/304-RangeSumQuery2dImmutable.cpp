// Last updated: 16/10/2025, 04:27:18
class NumMatrix {
public:
    
int ans[202][202];
NumMatrix(vector<vector<int>>& matrix) {
    int m = matrix.size();
    int n = matrix[0].size();
    
    
    for(int i = 0;i<=m;i++){
        
        for(int j = 0;j<=n;j++){ 
            if(i==0 or j==0){
                ans[i][j]=(0);
            }
            else{
                int sum = matrix[i-1][j-1]+ans[i-1][j]+ans[i][j-1]-ans[i-1][j-1];
                ans[i][j]=(sum);
            }                
        }
    }
}

int sumRegion(int row1, int col1, int row2, int col2) {
    return ans[row2+1][col2+1]-ans[row1][col2+1]-ans[row2+1][col1]+ans[row1][col1];
}
};