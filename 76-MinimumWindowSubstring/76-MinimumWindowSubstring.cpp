// Last updated: 16/10/2025, 04:30:05
//Video: https://www.youtube.com/watch?v=e1HlptlipB0

class Solution {
public:
//     string minWindow(string s, string t) {
//     map<char,int>mp1;
//     map<char,int>mp2;
//     string ans="";
//     for(char it : t){
//         mp2[it]++;
        
//     }
    
//     int mcnt=0;
//     int dmcnt=t.size();
    
//     int l=0;
//     int r=0;
   
//   while(true)  {
//     bool flag1=0;
//     bool flag2=0;
//     while(mcnt < dmcnt && r<s.size()){
        
//         mp1[s[r]]++;
        
//         if(mp1.find(s[r])!=mp1.end() && mp1[s[r]]<=mp2[s[r]]){
//               mcnt++;
//           }
//         r++;
//         flag1=1;
//     }
     
//     while(l<r && mcnt==dmcnt){
//        string s1=s.substr(l,r-l);
     
//          if( ans.size()==0||s1.size()<ans.size()){
//              ans=s1;
//          }
     
//             mp1[s[l]]--;
//     if(mp1[s[l]] == 0){
//             mp1.erase(s[l]);
//         }
        
//      if( mp1[s[l]] < mp2[s[l]]){
//              mcnt--;
            
//          }   
     
//         l++;
//         flag2=1;
//     }
     
//       if(flag1==0 && flag2==0){
//           break;
//       }
//   }
//      return ans;
//     }
    
    //Above solution is giving TLE for very large string inputs
    string minWindow(string s, string t) {
        if (s.size() < t.size() or s.empty()) {
            return "";
        }
        
        int i = 0, j = 0;
        int start = -1, len = INT_MAX;
        std::vector<int> m(128, 0);
        
        // Push elements of t into hash table.
        for (auto c : t) {
            m[c]++;
        }
        
        while (j < s.size()) {
            if (isFound(m)) {
                // Current string contains all characters of t,
                // then we start to shrink it from left.
                if (j - i < len) {
                    start = i;
                    len = j - i;
                }
                m[s[i++]]++;
                continue;
            }
            // Current string doesn't contain all characters of t,
            // so we need to extend it and do checking in the next iteration.
            m[s[j++]]--;
        }
        
        // Try to shrink the last found string.
        while (isFound(m)) {
            if (j - i < len) {
                start = i;
                len = j - i;
            }
            m[s[i++]]++;
        }
        
        if (start != -1) {
            return s.substr(start, len);
        }
        return "";
    }

private:
    // If all values of hash table are <= 0,
    // it means all characters of t are included in current string
    bool isFound(const std::vector<int>& m) {
        return std::all_of(m.begin(), m.end(), [](int i) { return i <= 0; });
    }
   
};