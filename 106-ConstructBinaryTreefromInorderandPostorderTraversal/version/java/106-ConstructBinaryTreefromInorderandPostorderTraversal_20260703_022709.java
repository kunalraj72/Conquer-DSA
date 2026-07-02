// Last updated: 03/07/2026, 02:27:09
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
18    HashMap<Integer, Integer> in_elem_index = new HashMap<>();
19    int index;
20    public TreeNode helper(int[] inorder, int[] postorder, int n, int in_start, int in_end){
21        if(index < 0 || in_start > in_end) return null;
22        
23        int elem = postorder[index--];
24        TreeNode root = new TreeNode(elem);
25        int position = in_elem_index.get(elem);
26
27        root.right = helper(inorder, postorder, n, position + 1, in_end);
28        root.left = helper(inorder, postorder, n, in_start, position - 1);
29
30        return root;
31    }
32
33    public TreeNode buildTree(int[] inorder, int[] postorder) {
34        int n = inorder.length;
35        for(int i = 0 ; i < n; i++){
36            in_elem_index.putIfAbsent(inorder[i], i);
37        }
38        index = n - 1;
39        return helper(inorder, postorder, n, 0, n - 1);
40    }
41}