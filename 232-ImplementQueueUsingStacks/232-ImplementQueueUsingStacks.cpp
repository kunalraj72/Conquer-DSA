// Last updated: 16/10/2025, 04:27:46
class MyQueue {
public:
    stack<int> input,output;
     MyQueue() {
        
    }
    
    void push(int x) {
        input.push(x);
    }
    
    int pop() {
        while(!input.empty())  
         {
           output.push(input.top());
           input.pop();
         }
        
        int val = output.top();
        output.pop();
        while(!output.empty()){
            input.push(output.top());
            output.pop();
        }
        return val;
    }
    
    int peek() {
        while(!input.empty()){
            output.push(input.top());
            input.pop();
        }
        int val = output.top();
        while(!output.empty()){
            input.push(output.top());
            output.pop();
        }
        return val;
    }
    
    bool empty() {
       return input.empty() == true;
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */