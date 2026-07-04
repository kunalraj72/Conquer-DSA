// Last updated: 04/07/2026, 20:12:29
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
17    public TreeNode findLastRight(TreeNode root){
18        while(root.right != null){
19            root = root.right;
20        }
21        return root;
22    }
23
24    public TreeNode helper(TreeNode root){
25        if(root.left == null){
26            return root.right;
27        }
28        if(root.right == null){
29            return root.left;
30        }
31
32        TreeNode left = root.left;
33        TreeNode right = root.right;
34        TreeNode lastRight = findLastRight(root.left);
35        lastRight.right = right;
36        return root.left;
37    }
38
39    public TreeNode deleteNode(TreeNode root, int key) {
40        if(root == null){
41            return root;
42        }
43
44        if(root.val == key){
45            return helper(root);
46        }
47
48        if(key < root.val){
49            root.left = deleteNode(root.left, key);
50        }else{
51            root.right = deleteNode(root.right, key);
52        }
53        return root;
54    }
55}