// Last updated: 16/10/2025, 04:27:45
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
    ListNode*reverse(ListNode*head){
        if(head==NULL || head->next==NULL){
            return head;
        }
        
        ListNode *curr,*nextnode,*prev;
        prev = NULL;
        curr = head;
        nextnode = NULL;
        
        while(curr!=NULL){
            nextnode = curr->next;
            curr->next = prev;
            prev = curr;
            curr = nextnode;
        }
     
        return prev;
    
    }
    
    bool isPalindrome(ListNode *head)
    {
        if(head == NULL || head->next==NULL){
            return true;
        }
        
        //finding Middle element using slow and fast pointer
        ListNode *slow = head;
        ListNode *fast = head;
        while(fast->next!= NULL && fast->next->next!=NULL) 
        //while loop changes slightly because incase of even elements we are
        //considering first first mid centre as mid for ex.(1,2,3,4,5,6) 3 is mid
        //Do dry run u will understand. Ex. 11211 and 112211 -->both e dry run.
        {
              slow = slow->next;
              fast = fast->next->next;
        }
        
        //reverse from the middle
        ListNode *newHead = reverse(slow);
        slow->next = NULL;
        
        //Compairing first half and second half
        while(head!=NULL && newHead!=NULL){
            if(head->val != newHead->val){
                return false;
            }
            head=head->next;
            newHead=newHead->next;
        }
        return true;
  }
};