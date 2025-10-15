// Last updated: 16/10/2025, 04:30:36
class Solution {
public:
    //https://leetcode.com/problems/rotate-image/discuss/3601463/Inplace-Rotation%3A-90-CLOCKWISE-90-ANTI-CLOCKWISE-180-with-codes-and-explanation
    
    //https://leetcode.com/problems/rotate-image/discuss/676495/Rotate-clockwise-or-anticlockwise-by-90-or-180-C%2B%2B
    
    //https://leetcode.com/problems/rotate-image/discuss/3601463/Inplace-Rotation%3A-90-CLOCKWISE-90-ANTI-CLOCKWISE-180-with-codes-and-explanation
    
    void rotate(vector<vector<int>>& matrix) {
        
        //Transpose
        int n = matrix.size();
        for(int i=0; i<n; i++) {
            for(int j=i; j<n; j++) {
                swap(matrix[i][j], matrix[j][i]);
            }
        }
        
        for(int i=0; i<n; i++) {
            //reverse every row
            reverse(matrix[i].begin(), matrix[i].end());
        }
    }
};