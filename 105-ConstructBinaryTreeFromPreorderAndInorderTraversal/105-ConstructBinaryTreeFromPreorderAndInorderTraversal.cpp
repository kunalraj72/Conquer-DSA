// Last updated: 16/10/2025, 04:29:28
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
    TreeNode *solve(vector<int>in, vector<int> pre,int n, int &index, int in_start, int in_end,
    unordered_map<int,int> &in_elem_index){
        if(index >=n || in_start > in_end){
            return NULL;
        }
        int elem = pre[index++];
        TreeNode *root = new TreeNode(elem);
        int position = in_elem_index[elem];
        
        //recursive left and right call 
        
        root->left = solve(in,pre,n,index,in_start,position-1,in_elem_index);
        root->right = solve(in,pre,n,index,position+1,in_end,in_elem_index);
        return root;
    }
    
   
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        int n = preorder.size();
        unordered_map<int,int>in_elem_index;
        for(int i=0;i<n;i++){
            in_elem_index[inorder[i]] = i;
        }
        int index = 0;
        return solve(inorder,preorder,n,index,0,n-1,in_elem_index);
    }
};