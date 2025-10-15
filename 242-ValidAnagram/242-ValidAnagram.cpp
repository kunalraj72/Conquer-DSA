// Last updated: 16/10/2025, 04:27:37
class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.size() != t.size()) return false;
        unordered_map<char,int> mp;
        for(int i=0;i<s.size();i++){
            mp[s[i]]++;
        }
        for(int i=0;i<t.size();i++){
            mp[t[i]]--;
            if(mp[t[i]] == 0) mp.erase(t[i]);
        }
        
        if(mp.empty()) return true;
        else return false;
    }
};