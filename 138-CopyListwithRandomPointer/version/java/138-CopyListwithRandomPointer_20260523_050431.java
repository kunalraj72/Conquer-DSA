// Last updated: 23/05/2026, 05:04:31
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18         if(head == null){
19            return null;
20        }
21
22        Node cur = head;
23        Node next = null;
24
25        //Inserting Copies to original list
26        while(cur != null){
27            next = cur.next;
28            Node copyNode = new Node(cur.val);
29            cur.next = copyNode;
30            copyNode.next = next;
31            cur = next;
32        }
33
34        //Setting Random Pointers for copy nodes
35        cur = head;
36        while(cur != null){
37            if(cur != null && cur.random != null) cur.next.random = cur.random.next;
38            if(cur.next != null) cur = cur.next.next;
39        }
40        
41        //Separate Lists (Note: original list should also remain intact even though we need to return the head or copied list)
42        cur = head;
43        Node newHead = cur.next;
44        Node copyNode = null;
45        while(cur != null){
46            copyNode = cur.next;
47            cur.next = copyNode.next;
48            cur = copyNode.next;
49            if(cur != null) copyNode.next = cur.next;
50        }
51
52        return newHead;
53    }
54}