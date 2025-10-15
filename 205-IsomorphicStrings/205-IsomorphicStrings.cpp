// Last updated: 16/10/2025, 04:28:17
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length() != t.length()) return false;
        int n = s.length();
        int m = t.length();
        unordered_map<char,char> mps;
        unordered_map<char,char> mpt;
        for(int i=0;i<n;i++){
            if(mps.find(s[i]) != mps.end()){
                if(mps[s[i]] != t[i]) return false;
            }
//we have to check from s->t as well as t->s. for ex s = "badc" && t= "baba".Try this test case.
            
            if(mpt.find(t[i]) != mpt.end()){
                if(mpt[t[i]] != s[i]) return false;
            }
            mps[s[i]] = t[i];
            mpt[t[i]] = s[i];
        }
        return true;
    }
};