// Last updated: 16/10/2025, 04:30:30
class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        vector<int> v;
        for(int i:digits)v.push_back(i);
        reverse(v.begin(),v.end());
        int car=1;
        for(int i=0;i<v.size();i++)
        {
            v[i]+=car;
            car=v[i]/10;
            v[i]%=10;
        }
        if(car)v.push_back(car);
        reverse(v.begin(),v.end());
        return v;
    }
};