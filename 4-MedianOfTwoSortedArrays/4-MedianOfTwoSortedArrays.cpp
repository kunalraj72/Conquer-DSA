// Last updated: 16/10/2025, 04:31:51
class Solution {
public:
    double findMedianSortedArrays(vector<int>& arr1, vector<int>& arr2) {
        
        int n = arr1.size();
        int m = arr2.size();
        
        int ind1 = 0;
        int ind2 = 0;
        int cnt = 0;
        int x,y;
        
        int elem1 = -1;
        int elem2 = -1;
        if((n+m)%2 == 0){
            elem1 = (n+m)/2 -1;
            elem2 = elem1 + 1;
        }else{
            elem1 = (n+m)/2;
        }
        
        while(ind1<n && ind2<m){
            if(arr1[ind1] <= arr2[ind2]){
                if(cnt == elem1){
                    x = arr1[ind1];
                }
                if(cnt == elem2){
                    y =  arr1[ind1];
                }
                cnt++;
                ind1 += 1;
                
            }
            else{
                
                if(cnt == elem1){
                    x =  arr2[ind2];
                }
                if(cnt == elem2){
                    y =  arr2[ind2];
                }
                ind2 += 1;
                cnt++;
            }
        }
        while(ind1 < n){
            
           if(cnt == elem1){
                x = arr1[ind1];
            }
            if(cnt == elem2){
                y =  arr1[ind1];
            }
            ind1++;
            cnt++;
        }
        
        while(ind2 < m){
            
            if(cnt == elem1){
                x =  arr2[ind2];
            }
            if(cnt == elem2){
                y =  arr2[ind2];
            }
            ind2++;
            cnt++;
        }
        
        if(elem2 == -1) return (double)x;
        else return (double)(x+y)/2;
    }
};