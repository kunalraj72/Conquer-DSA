// Last updated: 16/10/2025, 04:29:26
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
     TreeNode *solve(vector<int>in, vector<int> post,int n, int &index, int in_start, int in_end,
     unordered_map<int,int> &in_elem_index){
        if(index < 0 || in_start > in_end){
            return NULL;
        }
        int elem = post[index--];
        TreeNode *root = new TreeNode(elem);
        int position = in_elem_index[elem];
        
        //recursive left and right call 
         
         root->right = solve(in,post,n,index,position+1,in_end,in_elem_index);
        root->left = solve(in,post,n,index,in_start,position-1,in_elem_index);
        return root;
    }
    
    
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
        int n = postorder.size();
        unordered_map<int,int>in_elem_index;
        for(int i=0;i<n;i++){
            in_elem_index[inorder[i]] = i;
        }
        int index = n-1;
        return solve(inorder,postorder,n,index,0,n-1,in_elem_index);
    }
};