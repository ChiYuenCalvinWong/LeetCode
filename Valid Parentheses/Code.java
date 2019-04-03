class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] data = s.toCharArray();
        
        for(int i = 0; i < data.length; i++) {
            if(stack.isEmpty()) {
                if(data[i] == '(' || data[i] == '[' || data[i] == '{') {
                    stack.push(data[i]);
                } else {
                    return false;
                }
            } else {
                if(data[i] == ')') {
                    if(stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (data[i] == ']') {
                    if(stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else if (data[i] == '}') {
                    if(stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.push(data[i]);
                }
            }
        }
        return stack.size() == 0;
    }
}
