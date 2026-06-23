// Last updated: 24/06/2026, 01:54:21
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
18    public void preorder(TreeNode root, List<Integer> ans){
19
20        if(root == null) return;
21
22        ans.add(root.val);
23        preorder(root.left, ans);
24        preorder(root.right, ans);
25    }
26
27    public List<Integer> preorderTraversal(TreeNode root) {
28
29        List<Integer> ans = new ArrayList<>();
30        
31        preorder(root, ans);
32        return ans;
33    }
34}