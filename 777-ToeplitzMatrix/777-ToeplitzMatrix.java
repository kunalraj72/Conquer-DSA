// Last updated: 16/10/2025, 04:26:03
class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1 >= 0 && j-1 >= 0 && matrix[i][j] != matrix[i-1][j-1]){
                    return false;
                }
                else{
                    continue;
                }
            }
        }
        return true;
    }
}