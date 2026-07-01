// Last updated: 02/07/2026, 00:42:35
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10class Solution {
11    HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
12    List<Integer> ans = new ArrayList<>();
13    HashSet<TreeNode> visited = new HashSet<>();
14    Queue<TreeNode> q = new LinkedList<>();
15    int distance = 0;
16
17    public void dfs(TreeNode root){
18        if(root == null) return;
19        if(root.left != null) parentMap.put(root.left, root);
20        if(root.right != null) parentMap.put(root.right, root);
21
22        dfs(root.left);
23        dfs(root.right);
24    }
25
26    public void bfs(TreeNode root, int k) {
27        if(root == null) return;
28
29        q.offer(root);
30        visited.add(root);
31
32        while(!q.isEmpty() && distance != k){
33            int size = q.size();
34            List<Integer> temp = new ArrayList<>();
35            for(int i = 0; i < size; i++){
36                root = q.poll();
37                if(root.left != null){
38                    if(!visited.contains(root.left)){
39                        visited.add(root.left);
40                        q.offer(root.left);
41                    }
42                }
43                if(root.right != null){
44                    if(!visited.contains(root.right)){
45                        visited.add(root.right);
46                        q.offer(root.right);
47                    } 
48                }
49                if(parentMap.containsKey(root)){
50                    TreeNode parent = parentMap.get(root);
51                   if(parent != null && !visited.contains(parent)){
52                        visited.add(parentMap.get(root));
53                        q.offer(parentMap.get(root));
54                   } 
55                }
56            }
57            distance++;
58        }
59    }
60
61
62    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
63        
64        if(root == null) return ans;
65        parentMap.put(root, null);
66        dfs(root);
67        bfs(target, k);
68        while(!q.isEmpty()){
69            ans.add(q.poll().val);
70        }
71        return ans;
72    }
73}