// Last updated: 16/10/2025, 04:27:13
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
    ListNode* oddEvenList(ListNode* head) {
         ListNode *even = NULL;
         ListNode *odd = NULL;
         ListNode *e = NULL;
         ListNode *o = NULL;
         int count = 1;
        while(head){
            if(count%2 == 0){
                if(even == NULL){
                    even = head;
                    e = even;
                }else{
                    e->next = head;
                    e = e->next;
                }
            }
          else{
                if(odd == NULL){
                    odd = head;
                    o = odd;
                }else{
                    o->next = head;
                    o = o->next;
                }
            }
            head = head->next;
            count++;
        }
        
        if(odd == NULL){
            return even;
        }
        
        if(even == NULL){
            return odd;
        }
        
         o->next = even;
         e->next = NULL;
        
        return odd;
        
    }     
        
};