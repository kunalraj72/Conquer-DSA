// Last updated: 02/02/2026, 02:48:46
1class Solution {
2    //Optimized Approach (If u r not getting then ask gpt to explain visually)
3    //Very important question, Binary serach on answer logic
4    public int kthSmallest(int[][] matrix, int k) {
5        int n = matrix.length;
6        int low = matrix[0][0];
7        int high = matrix[n-1][n-1];
8
9       while(low < high){
10        int mid = low + (high - low) / 2;
11        int count = countLessEqual(matrix, mid);
12        if(count < k){
13            low = mid + 1;
14        }else{
15            high = mid;
16        }
17       }
18       return low | high;
19    }
20
21    public int countLessEqual(int[][] matrix, int mid){
22        int m = matrix.length;
23        int n = matrix[0].length;
24        int row = 0;
25        int col = m - 1;
26        int count = 0;
27
28        while(row < m && col >= 0){
29            if(matrix[row][col] <= mid){
30                count += col + 1;
31                row++;
32            }else{
33                col--;
34            }
35        }
36        return count;
37    }
38
39}
40
41// [1, 5, 9]
42// [10,11,13]
43// [12,13,15]