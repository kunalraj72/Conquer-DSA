// Last updated: 16/10/2025, 04:27:06
class Solution {
public:
    int firstUniqChar(string s) {
        unordered_map<char,pair<int,int>>mp;
         
        int n = s.length();
        for(int i=0;i<n;i++){
            mp[s[i]].first++;
            mp[s[i]].second = i;
        }
         
        int min_index = -1;
        for(auto it : mp){
              int count = it.second.first;
              int firstIndex = it.second.second;
            if (count == 1 && (min_index == -1 || firstIndex < min_index)) {
            min_index = firstIndex;
        }
        }
          
       return min_index;
    }
};