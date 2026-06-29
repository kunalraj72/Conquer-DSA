// Last updated: 30/06/2026, 02:22:37
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
18    public boolean helper(TreeNode left, TreeNode right){
19        if(left == null || right == null) return left == right;
20
21        return left.val == right.val && helper(left.left, right.right) && helper(left.right, right.left);
22    }
23    public boolean isSymmetric(TreeNode root) {
24        if(root == null) return true;
25        
26        return helper(root.left, root.right);
27    }
28}