// Last updated: 01/03/2026, 04:41:09
1class Solution {
2    public List<Integer> spiralOrder(int[][] mat) {
3        int n = mat.length;
4        int m = mat[0].length;
5        int left = 0;
6        int right = m-1;
7        int top = 0;
8        int bottom = n-1;
9        List<Integer> ans = new ArrayList<>();
10        
11        while(top <= bottom && left <= right){
12            
13            //Traverse Right
14            for(int i = left; i <= right ; i++){
15                ans.add(mat[top][i]);
16            }
17            top++;
18
19            //Traverse Down
20            for(int i = top; i <= bottom; i++){
21                ans.add(mat[i][right]);
22            }
23            right--;
24            
25            //Traverse Left
26            if(top <= bottom){
27                for(int i = right; i >= left; i--){
28                ans.add(mat[bottom][i]);
29                }
30                bottom--;
31            }
32            
33            //Traverse Up
34            if(left <= right){
35                for(int i = bottom; i >= top; i--){
36                ans.add(mat[i][left]);
37                }
38                left++;
39            }
40        }
41        return ans;
42    }
43}