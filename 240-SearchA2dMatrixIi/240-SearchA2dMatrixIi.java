// Last updated: 16/10/2025, 04:27:35
class Solution {

// Brute force → O(m·n)
// Your idea → check each of the m rows, binary search each → O(m·log n) ✅
// But can we do better? Yes, we can get O(m+n), but not O(log (m·n)) because 
// matrix is not falttend sorted unlike problem 74.
// [ 1   4   7   11 ]
// [ 2   5   8   12 ]
// If you flatten → [1,4,7,11,2,5,8,12] (not sorted).
//Start from top right corner and go downwards or leftwards based on below condition


    
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int r = 0;
        int c = n - 1;

        while(r < m && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }else if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return false;
    }
}