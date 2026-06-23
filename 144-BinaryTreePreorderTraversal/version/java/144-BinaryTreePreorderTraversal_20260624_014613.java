// Last updated: 24/06/2026, 01:46:13
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17
18    //using stack
19
20    public List<Integer> preorderTraversal(TreeNode root) {
21
22        List<Integer> ans = new ArrayList<>();
23        Stack<TreeNode> st = new Stack<>();
24        if(root == null) return ans;
25        st.push(root);
26
27        while(!st.isEmpty()){
28
29            TreeNode node  = st.pop();
30            ans.add(node.val);
31
32            if(node.right != null){
33                st.push(node.right);
34            }
35            if(node.left != null){
36                st.push(node.left);
37            }        
38        }
39        return ans;
40    }
41}