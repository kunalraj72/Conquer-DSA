// Last updated: 16/10/2025, 04:23:47
class Solution {
public:
    bool isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if(sx == fx && sy == fy){
            if(t == 1){
                return false;
            }
            return true;
        }
        int b = max(abs(sx-fx),abs(sy-fy));
        if(b <= t) return true;
        return false;
    }
};