// Last updated: 16/10/2025, 04:25:38
// Important Doc to build Understanding: https://leetcode.com/problems/sum-of-subarray-ranges/discuss/1626628/O(n)-solution-with-monotonous-stack-oror-Full-explaination

//Video Link: https://www.youtube.com/watch?v=V0GNBkWYDaY

class Solution {
public:
    int sumSubarrayMins(vector<int>& arr) {
    
      const unsigned int M = 1000000007;
        stack<int> st;
        int ans=0;
        int n=arr.size();
        vector<int> nse(n),pse(n);
    
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[st.top()]>arr[i])
            {
                nse[st.top()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty())
        {
            nse[st.top()]=n;   //Do dry run u will understand
            st.pop();
        }
       
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && arr[st.top()]>=arr[i])
            {
                pse[st.top()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty())
        {
            pse[st.top()]=-1;   //Do dry run u will understand
            st.pop();
        }
        for(int i=0;i<n;i++)
        {
            ans=ans%M+((arr[i]%M)*(nse[i]-i)*(i-pse[i]))%M;
            
        }
        return ans%M;

	}
    
};