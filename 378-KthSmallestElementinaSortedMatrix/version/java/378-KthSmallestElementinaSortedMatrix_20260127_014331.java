// Last updated: 27/01/2026, 01:43:31
1class Solution {
2    //Optimized Approach (If u r not getting then ask gpt to explain visually)
3    public int kthSmallest(int[][] matrix, int k) {
4        int n = matrix.length;
5        int low = matrix[0][0];
6        int high = matrix[n-1][n-1];
7
8        while (low < high) {
9            int mid = low + (high - low) / 2;
10            int count = countLessEqual(matrix, mid);
11
12            if (count < k) {
13                low = mid + 1;
14            } else {
15                high = mid;
16            }
17        }
18        return low | high;
19    }
20
21    public int countLessEqual(int[][] matrix, int mid){
22        int n = matrix.length;
23        int m = matrix[0].length;
24        int row = 0, col = m - 1;
25        int count = 0;
26
27        while(row < n && col >= 0){
28            if(matrix[row][col] <= mid){
29                count += col + 1;
30                row++;
31            }else{
32                col--;
33            }
34        }
35        return count;
36    }
37
38}
39
40// [1, 5, 8]
41// [10,11,13]
42// [12,13,15]