// Last updated: 16/10/2025, 04:26:43
class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> st;
        unordered_map<int,int>mp;
        vector<int> v(nums2.size());
        if(nums1.empty()){
            return v;
        }
        for(int i=0;i<nums2.size();i++){
            v[i] = -1;
        }
           int i = 0;
        while(i < nums2.size()){
            if(st.empty()){
                st.push(i);
                i++;
            }
            else if(nums2[i] <= nums2[st.top()]){
                st.push(i);
                i++;
            }
            else{
                v[st.top()] = nums2[i];
                st.pop();
            }
        }
        for(int j=0;j<nums2.size();j++){
            mp[nums2[j]] = v[j];
        }
        for(int i=0;i<nums1.size();i++){
            nums1[i] = mp[nums1[i]];
        }
        return nums1;
    }
};