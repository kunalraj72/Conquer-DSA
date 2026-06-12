// Last updated: 13/06/2026, 03:14:57
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        //Think in terms of distance travelled
15        ListNode curA = headA;
16        ListNode curB = headB;
17        int cntA = 0;
18        int cntB = 0;
19        while(curA != null){
20            cntA++;
21            curA = curA.next;
22        }
23        while(curB != null){
24            cntB++;
25            curB = curB.next;
26        }
27        int diff = 0;
28        curA = headA;
29        curB = headB;
30        if(cntA > cntB){
31            diff = cntA - cntB;
32            while(curA != null && diff > 0){
33                curA = curA.next;
34                diff--;
35            }
36        }else{
37            diff = cntB - cntA;
38            while(curB != null && diff > 0){
39                curB = curB.next;
40                diff--;
41            }
42        }
43        while(curA != curB){
44            curA = curA.next;
45            curB = curB.next;
46        }
47        return curA;
48    }
49}