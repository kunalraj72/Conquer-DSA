// Last updated: 05/07/2026, 02:19:59
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
17    List<Integer> inorder = new ArrayList<>();
18
19    public void helper(TreeNode root){
20        if(root == null) return;
21
22        helper(root.left);
23        inorder.add(root.val);
24        helper(root.right);
25    }
26
27    public boolean isValidBST(TreeNode root) {
28        if(root == null) return false;
29
30        helper(root);
31        for(int i = 1; i < inorder.size(); i++){
32            if(inorder.get(i) <= inorder.get(i - 1)){
33                return false;
34            }
35        }
36        return true;
37    }
38}