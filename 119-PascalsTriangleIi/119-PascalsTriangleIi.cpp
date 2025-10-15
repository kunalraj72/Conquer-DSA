// Last updated: 16/10/2025, 04:29:18
class Solution {
public:
    vector<int> getRow(int rowIndex) {
     vector<int>res;
 
		long val =1;  
		for(int j=0; j<=rowIndex; j++){
			res.push_back((int)val);
			val = val * (rowIndex-j) / (j+1);
		}
		  return res;     
    }
};