/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) { 
        Stack<Node> st = new Stack<>();
        List<Integer> result = new LinkedList<>();
        
        if(root == null) {
            return result;
        }
        
        st.push(root);
        while(!st.isEmpty()) {
            Node temp = st.pop();
            result.add(temp.val);
            for(int i = temp.children.size() - 1; i >= 0; i--) {
                st.push(temp.children.get(i));
            }
        }
        
        return result;
        
    }
}
