// Last updated: 16/10/2025, 04:24:06
class Solution {
public:
    int numberOfEmployeesWhoMetTarget(vector<int>& hours, int target) {
        int count = 0;
        for(int i=0;i<hours.size();i++){
            if(hours[i] >= target){
                count++;
            }
        }
        return count;
    }
};