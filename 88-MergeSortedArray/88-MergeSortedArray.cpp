// Last updated: 16/10/2025, 04:29:53



        
    


class Solution {

public:

    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {

        //Agar samajh nahi aaye toh jara gaur farmao dono array sorted hai :)

        int p=m-1,q=n-1,i=m+n-1;

        while(q>=0){

            if(p>=0 && nums1[p]>nums2[q]){

                nums1[i--]=nums1[p--];

            }

            else{

                nums1[i--]=nums2[q--];

            }

        }

    }

};