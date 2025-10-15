// Last updated: 16/10/2025, 04:24:07
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
    int helper(ListNode *head){
        if(!head){
            return 0;
        }
        
        int num = helper(head->next);
        head->val = head->val*2 + num;
        num = head->val/10;
        head->val = head->val%10;;
        return num;
        
    }
    ListNode* doubleIt(ListNode* head) {
        if(!head){
            return head;
        }
        int val = helper(head);
        if(val){
            ListNode *noodie = new ListNode(val);
            noodie->next = head;
            return noodie;
        }
        return head;
    }
};