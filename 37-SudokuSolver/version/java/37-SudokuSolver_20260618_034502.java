// Last updated: 18/06/2026, 03:45:02
1class Solution {
2
3    public boolean isSafe(int row, int col, char[][] mat, int val){
4        
5        // Row Check
6        for(int i = 0; i < 9; i++){
7            if(mat[row][i] - 0 == val){
8                return false;
9            }
10        }
11        
12        //Col Check
13        for(int i = 0; i < 9; i++){
14            if(mat[i][col] - 0 == val){
15                return false;
16            }
17        }
18        
19//Sudoku boxes are (top-lef of every 3*3 sub-grid)
20        
21//(0,0) (0,3) (0,6)
22
23//(3,0) (3,3) (3,6)
24
25//(6,0) (6,3) (6,6)
26        
27        //3*3 Sub Grid Check
28        int startRow = (row / 3) * 3;
29        int startCol = (col / 3) * 3;
30        
31        //mat[startRow][startCol] will give you the top-left 
32        //corner of every 3*3 sub-grid, Dry run with (5,7), u
33        //will understand the formula
34        
35        for(int i = startRow; i < startRow + 3; i++){
36            for(int j = startCol; j < startCol + 3; j++){
37        
38                if(mat[i][j] - 0 == val){
39                    return false;
40                }
41            }
42        }
43        
44        return true;
45    }
46    
47    
48    public boolean solve(char[][] mat){
49        
50        for(int row = 0; row < 9; row++){
51            for(int col = 0; col < 9; col++){
52                if(mat[row][col] == '.'){
53                    for(char val = '1'; val <= '9'; val++){
54                        if(isSafe(row, col, mat, val)){
55                            //1st case 
56                            mat[row][col] = val;
57                            //recursion call
58                            boolean possible = solve(mat);
59                            //Q.) why boolean check before backtrack?
60                            //We use a boolean return because we only
61                            //need one valid completed board. Once a 
62                            //solution is found, we propagate true up 
63                            //the recursion stack and avoid backtracking
64                            //the cells that are part of the final solution.
65                            //In N-Queens, we backtrack after every recursive 
66                            //call because we need to explore all possible solutions.
67                            if(possible){
68                                return true;
69                            }else{
70                                //backtrack
71                                mat[row][col] = '.';
72                            }
73                        }
74                    }
75                    return false;
76                }
77                
78            }
79        }
80        return true;
81    }
82    
83
84    public void solveSudoku(char[][] board) {
85        solve(board);
86    }
87}