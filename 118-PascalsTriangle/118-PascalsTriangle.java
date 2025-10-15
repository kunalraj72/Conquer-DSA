// Last updated: 16/10/2025, 04:29:23
class Solution {
    public List<List<Integer>> generate(int numRows) {
        //code for first row
        var row = new ArrayList<>(List.of(1));
        List<List<Integer>> res = new ArrayList<>(List.of(row));
        if(numRows == 1) return res;
        
        //code for second row
        row = new ArrayList<>(List.of(1, 1));
        res.add(row);
        if(numRows == 2) return res;
        
        //code for further rows
        for(int i=2;i<numRows;i++){
            var newRow = new ArrayList<Integer>(List.of(1)); //adding 1 at the start
            for(int j=0;j<row.size()-1;j++){
                newRow.add(row.get(j) + row.get(j+1)); //sum of just above 2 elements of i-1 row
            }
            newRow.add(1); //adding 1 at the end
            res.add(newRow);
            row = newRow; //present row becomes the previous row
        }
        
        return res;
    }
}

 //Note: newRow is the present row and row is the previous row