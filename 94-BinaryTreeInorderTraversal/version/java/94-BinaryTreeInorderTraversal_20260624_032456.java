// Last updated: 24/06/2026, 03:24:56
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
17    public List<Integer> inorderTraversal(TreeNode root) {
18        
19        List<Integer> inorder = new ArrayList<>();
20        Stack<TreeNode> st = new Stack<>();
21        
22        while(true){
23            
24            //moving towards extreme left
25            if(root != null){
26                st.push(root);
27                root = root.left;
28            }
29            else{
30                if(st.isEmpty()){
31                    break;
32                }
33                //root
34                root = st.pop();
35                inorder.add(root.val);
36
37                //moving towards right children
38                root = root.right;
39
40            }
41            
42        }
43
44        return inorder;
45    }
46}