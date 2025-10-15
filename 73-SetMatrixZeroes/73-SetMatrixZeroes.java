// Last updated: 16/10/2025, 04:30:08
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        HashSet<Integer>  setRows= new HashSet<>();
        HashSet<Integer> setCols = new HashSet<>();
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    setRows.add(i);
                    setCols.add(j);
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(setRows.contains(i) || setCols.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}