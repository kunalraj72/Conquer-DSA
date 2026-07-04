// Last updated: 05/07/2026, 04:51:24
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
17    int index;
18    TreeNode solve(int[] pre, int maxi, int mini, int size){
19       
20       if(index >= size){
21           return null;
22       }
23       
24       if(pre[index] <= mini || pre[index] >= maxi){
25           return null;
26       }
27       
28       TreeNode root = new TreeNode(pre[index++]);
29       root.left = solve(pre,root.val,mini,size);
30       root.right = solve(pre,maxi,root.val,size);
31       return root;
32   }
33
34    public TreeNode bstFromPreorder(int[] preorder) {
35        int size = preorder.length;
36        index = 0;
37        int maxi = Integer.MAX_VALUE;
38        int mini = Integer.MIN_VALUE;
39        return solve(preorder,maxi,mini,size);
40    }
41}