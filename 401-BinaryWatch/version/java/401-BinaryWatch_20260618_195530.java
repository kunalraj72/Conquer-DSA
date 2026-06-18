// Last updated: 18/06/2026, 19:55:30
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> ans = new ArrayList<>();
4        for(int HH = 0; HH <= 11; HH++){
5            for(int MM = 0; MM <= 59; MM++){
6                if(Integer.bitCount(HH) + Integer.bitCount(MM) == turnedOn){
7                    String hour = String.valueOf(HH);
8                    String mins = String.valueOf(MM);
9                    if(MM <= 9){
10                        mins = "0" + mins;
11                    }
12                    ans.add(hour + ":" + mins);
13                }
14            }
15        }
16        return ans;
17    }
18}