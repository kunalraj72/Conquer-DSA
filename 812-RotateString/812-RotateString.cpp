// Last updated: 16/10/2025, 04:25:55
class Solution {
public:
    bool rotateString(string s, string goal) {
        //return s.size()==goal.size() && (s+s).find(goal);
        
        int n = s.size();
        
        for(int i=0;i<n;i++){
            s = s.substr(1,n-1) + s.substr(0,1);
            if(s == goal) return true;
        }
        
        return false;
    }
};