// Last updated: 16/10/2025, 04:29:17
class Solution {
public:
    
     
    
    int minimumTotal(vector<vector<int>>& triangle) {
        int m = triangle.size();
        int n = triangle[0].size();
        vector<int> front(m);
          
            for(int j=m-1;j>=0;j--){
                front[j] = triangle[m-1][j];
            }
        
        for(int i=m-2;i>=0;i--){
           
            vector<int> cur(m);
            for(int j=i;j>=0;j--){
                int down = triangle[i][j] + front[j];
                int diagonal = triangle[i][j] + front[j+1];
                   cur[j] = min(down,diagonal);
            }
            front = cur;
        }
           return front[0];
    }
};