// Last updated: 16/10/2025, 04:31:10
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
class cmp{
     public:
     bool operator()(ListNode* a, ListNode* b){
         if(a->val > b->val)return true;
         else return false;
     }
 };
class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& arr) {
           //Video : https://www.youtube.com/watch?v=RYJ3vs8qx10
           //Similar as merge k sorted arrays
           priority_queue<ListNode*,vector<ListNode*>,cmp> pq;
           ListNode *dummy = new ListNode(-1);
           ListNode *tail = dummy;
           
           for(int i=0;i<arr.size();i++){
               if(arr[i] != NULL){
                   pq.push(arr[i]);
               }
           }
           
           while(!pq.empty()){
               ListNode *temp = pq.top();
               tail->next = temp;
               tail = temp;
               pq.pop();
               if(temp->next != NULL){
                   pq.push(temp->next);
               }
           }
           return dummy->next;
    }
};