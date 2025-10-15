// Last updated: 16/10/2025, 04:25:45
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int n = s.length();
        List<List<Integer>> ls = new ArrayList<>();
        int i=0,j=0;
        for(i=0;i<n-1;i++){
            if(s.charAt(i) != s.charAt(i+1)){ 
                if((i-j+1) >=3){
                 ls.add(Arrays.asList(j,i)); 
                }
              j = i+1;
            } 
        }
        if(i == n-1  && i-j+1 >= 3){
            ls.add(List.of(j,i)); //both List.of() and Arrays.asList() are same except the fact that List.of() is immutable.
        }
        return ls;
    }
}