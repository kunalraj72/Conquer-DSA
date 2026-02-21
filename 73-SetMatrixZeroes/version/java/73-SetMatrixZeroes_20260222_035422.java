// Last updated: 22/02/2026, 03:54:22
1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        HashSet<Integer>  setRows= new HashSet<>();
6        HashSet<Integer> setCols = new HashSet<>();
7        
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                if(matrix[i][j] == 0){
11                    setRows.add(i);
12                    setCols.add(j);
13                }
14            }
15        }
16        
17        for(int i=0;i<m;i++){
18            for(int j=0;j<n;j++){
19                if(setRows.contains(i) || setCols.contains(j)){
20                    matrix[i][j] = 0;
21                }
22            }
23        }
24    }
25}