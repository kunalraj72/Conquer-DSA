// Last updated: 16/10/2025, 04:29:50
class Solution {
public:
    
 vector<int> nextSmallerElement(vector<int> &arr, int n)
 {  //note we need to store  and return index this time to calculate breadth so we need to         do minor changes int this function.
    stack<int>st;
    int temp;
    st.push(-1);
     vector<int> ans(n);
    for(int i=n-1;i>=0;i--)
    {
             while(st.top() != -1 && arr[st.top()] >= arr[i]){
                 st.pop();
             }
            // temp = arr[i];
             ans[i] = st.top();
             st.push(i);
     }
    return ans; 
 }
    
vector<int> prevSmallerElement(vector<int> &arr, int n)
{
    stack<int>st;
    vector<int> ans(n);
    st.push(-1);
    for(int i=0;i<n;i++)
    {
             while(st.top() != -1 && arr[st.top()]>=arr[i]){
                 st.pop();
             }
            // temp = arr[i];
             ans[i] = st.top();
             st.push(i);
     }
    return ans; 
}
    
    int largestRectangleArea(vector<int>& heights) {
         int n = heights.size();
         vector<int> next(n);
         vector<int> prev(n);
        
         prev = prevSmallerElement(heights,n);
         next = nextSmallerElement(heights,n);
         int area = INT_MIN , newArea = 0;
         for(int i =0;i<n;i++){
            int length = heights[i];
             if(next[i] == -1) next[i] = n;
            int breadth = next[i] - prev[i] - 1;
            
             newArea = length*breadth;
             area = max(area,newArea);
         }
        return area;
    }
};