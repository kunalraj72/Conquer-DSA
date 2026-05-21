// Last updated: 22/05/2026, 02:51:56
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
25        while(cur != null){
26            next = cur.next;
27            Node copyNode = new Node(cur.val);
28            cur.next = copyNode;
29            copyNode.next = next;
30            cur = next;
31        }
32
33
34        cur = head;
35        while(cur != null){
36            if(cur != null && cur.random != null) cur.next.random = cur.random.next;
37            if(cur.next != null) cur = cur.next.next;
38        }
39
40        cur = head;
41        Node newHead = cur.next;
42        Node copy = null;
43        while(cur != null){
44            copy = cur.next;
45            cur.next = copy.next;
46            cur = copy.next;
47            if(cur != null) copy.next = cur.next;
48        }
49
50        return newHead;
51    }
52}