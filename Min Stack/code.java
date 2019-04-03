class MinStack {

    Stack<Integer> data;
    int min;
    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        if(x <= min) {
            data.push(min);
            min = x;
        }
        data.push(x);
    }
    
    public void pop() {
        if(data.pop() == min) {
            min = data.pop();
        }
    }
    
    public int top() {
        return data.peek();
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
