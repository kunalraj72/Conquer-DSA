// Last updated: 16/10/2025, 04:27:58
class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        //Note: only 2 element at max possible which can occur > floor(n/3);
//         int n = nums.size();
        
//         vector<int> ans;
//         int count1 = 0;
//         int count2 = 0;
//         int elem1 = -1;
//         int elem2 = -1;
//         int i = 0;
        
//         for(int i=0;i<n;i++){
            
//             if(nums[i] == elem1){
//                 count1++;
//             }
//             else if(nums[i] == elem2){
//                 count2++;
//             }
//             else if(count1 == 0){
//                 elem1 = nums[i];
//                 count1++;
//             }
//             else if(count2 == 0){
//                 elem2 == nums[i];
//                 count2++;
//             }
//             else{
//                 count1--;
//                 count2--;
//             }
//         }
        
//         int cnt1 = 0;
//         int cnt2 = 0;
        
//         for(int i=0;i<n;i++){
//             if(nums[i] == elem1){
//                 cnt1++;
//             }
//             else if(nums[i] == elem2){
//                 cnt2++;
//             }
//         }
        
//         if(cnt1 > n/3){
//             ans.push_back(elem1);
//         }
//         if(cnt2 > n/3){
//             ans.push_back(elem2);
//         }
//         return ans;
        int n = nums.size();
     int nums1 = -1 , nums2 = -1 , count1 = 0 , count2 = 0;

        for(int i=0;i<n;i++)
        {
            if(nums[i] == nums1)
            {
                count1++;
            }
            else if(nums[i] == nums2)
            {
                count2++;
            }
            else if(count1 == 0)
            {
                nums1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0)
            {
                nums2 = nums[i];
                count2 = 1;
            }
            else
            {
                count1--;
                count2--;
            }
        }

        vector<int>ans ; 
        count1=0,count2=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i] == nums1)
            {
                count1++;
            }
            else if(nums[i] == nums2)
            {
                count2++;
            }
        }

        if(count1 > n/3)
        {
            ans.push_back(nums1);
        }
        if(count2 > n/3)
        {
            ans.push_back(nums2);
        }

        return ans;
    }
};