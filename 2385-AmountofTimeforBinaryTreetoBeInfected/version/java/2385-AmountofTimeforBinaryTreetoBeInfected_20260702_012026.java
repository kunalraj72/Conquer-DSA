// Last updated: 02/07/2026, 01:20:26
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
17    HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
18    HashSet<TreeNode> visited = new HashSet<>();
19    Queue<TreeNode> q = new LinkedList<>();
20    int time = 0;
21    TreeNode startNode;
22
23    public void dfs(TreeNode root, int start){
24        if(root == null) return;
25        if(root.val == start) startNode = root;
26        if(root.left != null) parentMap.put(root.left, root);
27        if(root.right != null) parentMap.put(root.right, root);
28
29        dfs(root.left, start);
30        dfs(root.right, start);
31    }
32
33    public void bfs(TreeNode root) {
34        if(root == null) return;
35
36        q.offer(root);
37        visited.add(root);
38
39        while(!q.isEmpty()){
40            int size = q.size();
41            List<Integer> temp = new ArrayList<>();
42            for(int i = 0; i < size; i++){
43                root = q.poll();
44                if(root.left != null){
45                    if(!visited.contains(root.left)){
46                        visited.add(root.left);
47                        q.offer(root.left);
48                    }
49                }
50                if(root.right != null){
51                    if(!visited.contains(root.right)){
52                        visited.add(root.right);
53                        q.offer(root.right);
54                    } 
55                }
56                if(parentMap.containsKey(root)){
57                    TreeNode parent = parentMap.get(root);
58                   if(parent != null && !visited.contains(parent)){
59                        visited.add(parentMap.get(root));
60                        q.offer(parentMap.get(root));
61                   } 
62                }
63            }
64            time++;
65        }
66    }
67    public int amountOfTime(TreeNode root, int start) {
68        if(root == null) return 0;
69        parentMap.put(root, null);
70        dfs(root, start); //populate parentMap and find startNode
71        bfs(startNode);
72        return time - 1;
73    }
74}