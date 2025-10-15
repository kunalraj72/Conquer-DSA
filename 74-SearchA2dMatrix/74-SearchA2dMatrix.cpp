// Last updated: 16/10/2025, 04:30:13
class Solution {
public:
    bool searchMatrix(vector<vector<int>>& mat, int x) {
        int n = mat.size();
        int m = mat[0].size();
        int i = 0, j = m-1;
	    while(i < n && j >= 0){
	        if(x == mat[i][j]){
	            return 1;
	        }
	        else if(x < mat[i][j]){
	            j--;
	        }
	        else if(x > mat[i][j]){
	            i++;
	        }
	    }
	    return 0;
    }
};