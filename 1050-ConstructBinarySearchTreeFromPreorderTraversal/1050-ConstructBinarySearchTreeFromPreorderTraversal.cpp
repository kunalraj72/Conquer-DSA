// Last updated: 16/10/2025, 04:25:14
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    TreeNode *solve(vector<int> &pre, int maxi, int mini, int &index, int size){
       
       if(index >= size){
           return NULL;
       }
       
       if(pre[index] <= mini || pre[index] >= maxi){
           return NULL;
       }
       
       TreeNode *root = new TreeNode(pre[index++]);
       root->left = solve(pre,root->val,mini,index,size);
       root->right = solve(pre,maxi,root->val,index,size);
       return root;
   }
    
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        int size = preorder.size();
        int index = 0;
        int maxi = INT_MAX;
        int mini = INT_MIN;
        return solve(preorder,maxi,mini,index,size);
    }
};