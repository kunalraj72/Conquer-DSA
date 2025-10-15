// Last updated: 16/10/2025, 04:29:10
class Solution {
public:
    
    //Video: https://www.youtube.com/watch?v=HQpDS9wuzws
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int n = gas.size();
        int curFuel = 0;
        int tot_fuel = 0;
        int tot_cost = 0;
        int diff = 0;
        int start = 0;
        for(int i=0;i<n;i++){
            tot_fuel += gas[i];
            tot_cost += cost[i];
        }
        if(tot_fuel < tot_cost){
            return -1;
        }
        
        for(int i=0;i<n;i++){
            curFuel += gas[i] - cost[i];
            if(curFuel < 0){
                curFuel = 0;
                start = i+1;
            }
        }
        return start;
    }
};