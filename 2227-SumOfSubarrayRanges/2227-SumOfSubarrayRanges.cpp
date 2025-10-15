// Last updated: 16/10/2025, 04:24:34
// Important Doc To Bulid The Understanding : https://leetcode.com/problems/sum-of-subarray-ranges/discuss/1626628/O(n)-solution-with-monotonous-stack-oror-Full-explaination

class Solution {
public:
    
    long long subArrayRanges(vector<int>& arr) {
     int n=arr.size();
        long long sum=0;
        stack<int>st;
        vector<int> minPrev(n,-1),minNext(n,n),maxPrev(n,-1),maxNext(n,n);
        
        for(int i=0;i<n;i++)
        {
            while(!st.empty() && arr[st.top()] > arr[i])
            {
                minNext[st.top()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){st.pop();}
        
        for(int i=n-1;i>=0;i--)
        {
            while(!st.empty() && arr[st.top()] >= arr[i])
            {
                minPrev[st.top()]=i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.empty()){st.pop();}
        
         for(int i=0;i<n;i++)
         {
            while(!st.empty() && arr[st.top()] < arr[i])
            {
                maxNext[st.top()]=i;
                st.pop();
            }
            st.push(i);
         }
         while(!st.empty()){st.pop();}
        
         for(int i=n-1;i>=0;i--)
         {
            while(!st.empty() && arr[st.top()] <= arr[i])
            {
                maxPrev[st.top()]=i;
                st.pop();
            }
            st.push(i);
         }
        
        for(int i=0;i<n;i++)
        {
            long long leftMin=i-minPrev[i],rightMin=minNext[i]-i;
            
            long long leftMax=i-maxPrev[i],rightMax=maxNext[i]-i;
            
            sum+=(leftMax*rightMax-leftMin*rightMin)*arr[i];
            
        }
        return sum;
	}
};