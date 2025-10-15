// Last updated: 16/10/2025, 04:24:24
class Solution {
public:
    vector<int> cycleLengthQueries(int n, vector<vector<int>>& queries) {
        vector<int> ans;
        for(auto q: queries){
            int t = 0, i = q[0], j = q[1];
            while(i != j){
                if(i > j) i = i/2;
                else j = j/2;
                t++;
            }
            ans.push_back(t+1);
        }
        return ans;
    }
};