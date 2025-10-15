// Last updated: 16/10/2025, 04:23:53
class Solution {
public:
    bool isAcronym(vector<string>& words, string s) {
        int n = words.size();
        string str = "";
        for(auto it : words){
            str += it[0];
        }
        return str == s;
    }
};