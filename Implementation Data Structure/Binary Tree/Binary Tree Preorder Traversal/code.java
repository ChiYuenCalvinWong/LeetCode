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
        a
    b       c
d     e   f     g

a   b   d   e   c   f   g
*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        
        if(root == null) {
            return result;
        }
        //push root to stack
        stack.push(root);
        
        while (!stack.empty()) {
            TreeNode pop = stack.pop();
            result.add(pop.val);
            if (pop.right != null) {
                stack.push(pop.right);
            }
            if(pop.left != null) {
                stack.push(pop.left);
            }
        }
        
        return result;
    }
}
