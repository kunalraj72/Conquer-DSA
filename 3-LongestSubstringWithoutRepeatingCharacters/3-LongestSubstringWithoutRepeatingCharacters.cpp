// Last updated: 16/10/2025, 04:31:57
//Video Link: https://www.youtube.com/watch?v=qtVh-XEpsJo&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=27

class Solution {
public:
    int lengthOfLongestSubstring(string S) {
        //Optimized Approach O(N)
//         int n = s.size();
//         map<char,int> mp;
//         int len = 0;
//         int l=0,r=0;
        
//         while(r < n){
//             if(mp.find(s[r]) != mp.end()){
//                 if(mp[s[r]] >= l ){
//                     l = mp[s[r]] + 1;
//                 }
//             }
//             mp[s[r]] = r;
//             len = max(len,r-l+1);
//             r++;
//         }
//         return len;
        
       //Brute Force Approach O(2N) 
         int n = S.size();
       int l = 0,r = 0;
       int len = 0;
       set<char> st;
       while(r<n){
           if(st.find(S[r]) != st.end()){
               while(S[l] != S[r]){
                   st.erase(S[l]);
                   l++;
               }
               st.erase(S[l]);
                   l++;
           }
           else{
               st.insert(S[r]);
               len = max(len,r-l+1);
               r++;
           }
           
       }
       return len;
    }
};