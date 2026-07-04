// Last updated: 04/07/2026, 13:36:15
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
17    TreeNode ans;
18    public TreeNode searchBST(TreeNode root, int val) {
19        if(root == null) return null;
20
21        if(root.val == val){
22            ans = root;
23        }
24
25        if(val < root.val){
26            searchBST(root.left, val);
27        }else{
28            searchBST(root.right, val);
29        }
30        return ans;
31    }
32}