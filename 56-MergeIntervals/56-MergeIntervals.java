// Last updated: 16/10/2025, 04:30:28
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        int [] temp = intervals[0];
        List<int[]> mergedIntervals = new ArrayList<>();
        for(int[] x : intervals){
            if(x[0] <= temp[1]){
                temp[1] = Math.max(temp[1], x[1]);
            }else{
                mergedIntervals.add(temp);
                temp = x;
            }
        }
        mergedIntervals.add(temp);
        return mergedIntervals.toArray(new int[mergedIntervals.size()][2]);
    }
}