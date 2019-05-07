/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
using stack and one current node to accomplish inorder travel
we always go to the leftmost node and push all the node from the root to the leftmost node
then we pop and check right node.
*/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        TreeNode current = root;
        
        while(current != null || !stack.empty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            
            current = stack.pop();
            result.add(current.val);
            
            current = current.right;
        }
        return result;
    }
}
