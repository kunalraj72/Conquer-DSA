// Last updated: 28/01/2026, 02:06:50
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        //top right(mat[0][n-1]) se search karna start karenge 
6        //and will go all the way till the diagonal bottom (matrix[m - 1][0])
7        int r = 0;
8        int c = n - 1;
9
10        while(r < m && c >= 0){
11            if(matrix[r][c] == target){
12                return true;
13            }else if(matrix[r][c] < target){
14                r++;
15            }else{
16                c--;
17            }
18        }
19        return false;
20    }
21}