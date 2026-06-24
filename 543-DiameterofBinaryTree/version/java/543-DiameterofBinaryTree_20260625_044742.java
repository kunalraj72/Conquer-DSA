// Last updated: 25/06/2026, 04:47:42
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
17    int maxi = 0;
18    public int helper(TreeNode root){
19        if(root == null) return 0;
20
21        int leftHeight = helper(root.left);
22        int rightHeight = helper(root.right);
23
24        maxi = Math.max(maxi, leftHeight + rightHeight);
25
26        return 1 + Math.max(leftHeight, rightHeight);
27    }
28
29    public int diameterOfBinaryTree(TreeNode root) {
30     
31        helper(root);
32        return maxi;
33    }
34}