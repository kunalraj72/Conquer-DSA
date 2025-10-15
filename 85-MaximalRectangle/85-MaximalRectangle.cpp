// Last updated: 16/10/2025, 04:29:47
//Video Link: https://www.youtube.com/watch?v=9u2BJfmWNEg

class Solution {
public:
    
    vector<int> nextSmallerElement(int arr[], int n)
 {  
    stack<int>st;
    st.push(-1);
    vector<int> ans(n);
    for(int i=n-1;i>=0;i--)
    {
          
             while(st.top() != -1 && arr[st.top()] >= arr[i]){
                 st.pop();
             }
           
             ans[i] = st.top();
             st.push(i);
           
     }
    return ans; 
 }
    
vector<int> prevSmallerElement(int arr[], int n)
{
    stack<int>st;
    st.push(-1);
    vector<int> ans(n);
    for(int i=0;i<n;i++)
    { 
             while(st.top() != -1 && arr[st.top()]>=arr[i]){
                 st.pop();
             }
            
             ans[i] = st.top();
             st.push(i);
           
     }
    return ans; 
}
    //Function to find largest rectangular area possible in a given histogram.
    int getMaxArea(int heights[], int n)
    {
         vector<int> next(n);
         vector<int> prev(n);
        
         prev = prevSmallerElement(heights,n);
         next = nextSmallerElement(heights,n);
         int area = INT_MIN , newArea = 0;
         for(int i =0;i<n;i++){
            long long  length = heights[i];
            if(next[i] == -1) next[i] = n;  //To handle the case when all elements are equal.
            long long breadth = next[i] - prev[i] - 1;
            
             newArea = length*breadth;
             area = max(area,newArea);
         }
        return area;
    }
    
    int maximalRectangle(vector<vector<char>>& M) {
        int n = M.size();
        int m = M[0].size();
        int matrix[n][m];
        for(int i = 0;i<n;i++){
            for(int j=0;j<m;j++){
                if(M[i][j] == '1'){
                    matrix[i][j] = 1;
                }else{
                    matrix[i][j] = 0;
                }
            }
        }
        int area = getMaxArea(matrix[0],m);
        
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
               if(matrix[i][j] !=0){
                   matrix[i][j] = matrix[i][j] + matrix[i-1][j];
               } 
               else{
                   matrix[i][j] = 0;
               }
            }
             area = max(area,getMaxArea(matrix[i],m));
        }
       return area;
    }
};