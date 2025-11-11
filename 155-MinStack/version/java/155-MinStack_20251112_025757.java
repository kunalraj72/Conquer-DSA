// Last updated: 12/11/2025, 02:57:57
MinStack minStack = new MinStack();
minStack.push(512);
minStack.push(-1024);
minStack.push(-1024);
minStack.push(512);
minStack.pop(); // Removes 512
System.out.println(minStack.getMin()); // -1024
minStack.pop(); // Removes -1024
System.out.println(minStack.getMin()); // -1024
minStack.pop(); // Removes -1024
System.out.println(minStack.getMin()); // 512