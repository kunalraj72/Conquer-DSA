// Last updated: 03/07/2026, 01:42:14
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
17    HashMap<Integer, Integer> in_elem_index = new HashMap<>();
18    int index = 0;
19    public TreeNode helper(int[] inorder, int[] preorder, int n, int in_start, int in_end){
20        if(index >= n || in_start > in_end) return null;
21        
22        int elem = preorder[index++];
23        TreeNode root = new TreeNode(elem);
24        int position = in_elem_index.get(elem);
25
26        root.left = helper(inorder, preorder, n, in_start, position - 1);
27        root.right = helper(inorder, preorder, n, position + 1, in_end);
28
29        return root;
30    }
31    public TreeNode buildTree(int[] preorder, int[] inorder) {
32        int n = inorder.length;
33        for(int i = 0 ; i < n; i++){
34            in_elem_index.putIfAbsent(inorder[i], i);
35        }
36        return helper(inorder, preorder, n, 0, n - 1);
37    }
38}