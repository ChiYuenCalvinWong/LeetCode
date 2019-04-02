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
    public List<Integer> postorder(Node root) {

        Stack<Node> st = new Stack<>();
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        st.push(root);
        while(!st.isEmpty()) {
            Node temp = st.pop();
            result.add(0,temp.val);
            for(int i = 0; i < temp.children.size(); i++) {
                st.push(temp.children.get(i));
            }
        }
        
        return result;
    }
}
