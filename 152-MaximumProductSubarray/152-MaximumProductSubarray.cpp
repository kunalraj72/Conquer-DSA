// Last updated: 16/10/2025, 04:28:54
class Solution {
public:
    int maxProduct(vector<int>& arr) {
        int n = arr.size();
          long long int prod=1,maxp=INT_MIN;
	    for(int i=0;i<n;i++){
	        prod *= arr[i];
	         maxp=max(maxp,prod);
	        if(prod==0){
	            prod=1;
	        }
	       
	        
	    }
	    prod=1;
	    for(int j=n-1;j>=0;j--){
	        prod *= arr[j];
	        maxp=max(maxp,prod);
	        if(prod==0){
	            prod=1;
	        }
	    }
	       
	        
	    return maxp;
    }
};