// Last updated: 16/10/2025, 04:27:08
class Solution {
    //Optimized Approach (If u r not getting then ask gpt to explain visually)
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);

            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low | high;
    }

    public int countLessEqual(int[][] matrix, int mid){
        int n = matrix.length;
        int m = matrix[0].length;
        int row = 0, col = m - 1;
        int count = 0;

        while(row < n && col >= 0){
            if(matrix[row][col] <= mid){
                count += col + 1;
                row++;
            }else{
                col--;
            }
        }
        return count;
    }

}

// [1, 5, 8]
// [10,11,13]
// [12,13,15]