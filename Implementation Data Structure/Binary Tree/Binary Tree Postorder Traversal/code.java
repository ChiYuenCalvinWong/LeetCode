/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        
        stack.push(root);
        while(!stack.empty()) {
            TreeNode pop = stack.pop();
            result.add(0, pop.val);
            
            if(pop.left != null) {
                stack.push(pop.left);
            }
            if(pop.right != null) {
                stack.push(pop.right);
            }
        }
        
        return result;
    }
}
