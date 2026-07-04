// Last updated: 05/07/2026, 02:46:54
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
19    public boolean isBST(TreeNode root, long maxi, long mini){
20        if(root == null) return true;
21
22        if(root.val <= mini || root.val >= maxi){
23            return false;
24        }
25
26        boolean left = isBST(root.left, root.val, mini);
27        boolean right = isBST(root.right, maxi, root.val);
28
29        return left && right;
30    }
31
32    public boolean isValidBST(TreeNode root) {
33        long mini = Long.MIN_VALUE;
34        long maxi = Long.MAX_VALUE;
35        return isBST(root,maxi,mini);
36    }
37}