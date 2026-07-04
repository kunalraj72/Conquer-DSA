// Last updated: 04/07/2026, 20:13:49
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
25        //Edge Case
26        if(root.left == null){
27            return root.right;
28        }
29        //Edge Case
30        if(root.right == null){
31            return root.left;
32        }
33
34        TreeNode left = root.left;
35        TreeNode right = root.right;
36        TreeNode lastRight = findLastRight(root.left);
37        lastRight.right = right;
38        return root.left;
39    }
40
41    public TreeNode deleteNode(TreeNode root, int key) {
42        if(root == null){
43            return root;
44        }
45
46        if(root.val == key){
47            return helper(root);
48        }
49
50        if(key < root.val){
51            root.left = deleteNode(root.left, key);
52        }else{
53            root.right = deleteNode(root.right, key);
54        }
55        return root;
56    }
57}