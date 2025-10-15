// Last updated: 16/10/2025, 04:28:40
class MinStack {
public:
    
    stack<pair<int,int>> s;
    public:
    
       /*returns min element from stack*/
       int getMin(){
           if(s.empty()) return -1;
           return  s.top().second;
           
       }
       
       /*returns poped element from stack*/
       int pop(){
           if(s.empty()) return -1;
           int temp = s.top().first;
           s.pop();
           return temp;
       }
       
       /*push element x into the stack*/
       void push(int x){
           if(s.empty()){
               s.push({x,x});
           }else{
                s.push({x,min(x,s.top().second)});
           }
       }
       //return top of the stack
       int top(){ 
           return s.top().first;
       }
    
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */