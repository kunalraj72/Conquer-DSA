// Last updated: 16/10/2025, 04:28:13
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        if(head == NULL){
            return head;
        }
       
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *cur = dummy;
        
        while(cur->next != NULL){
            if(cur->next->val == val){
              cur->next = cur->next->next;
              // delete(cur->next);
            }
            else{
                cur = cur->next;
            }
        }
        
        return dummy->next;
    }
};