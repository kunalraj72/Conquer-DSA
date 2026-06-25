// Last updated: 26/06/2026, 03:05:40
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
18    int maxi = -1001;
19    public int helper(TreeNode root){
20        if(root == null) return 0;
21        
22        //Whenever there is a negative node, then return 0 as it does not contribute to out ans.
23        int leftSum = Math.max(0, helper(root.left));
24        int rightSum = Math.max(0, helper(root.right));
25
26        maxi = Math.max(maxi, root.val + leftSum + rightSum);
27        return root.val + Math.max(leftSum, rightSum);
28    }
29
30    public int maxPathSum(TreeNode root) {
31        helper(root);
32        return maxi;
33    }
34}