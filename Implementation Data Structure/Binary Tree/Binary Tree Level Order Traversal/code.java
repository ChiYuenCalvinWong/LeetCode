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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        if(root == null) {
            return result;
        }
        
        int count1 = 0;
        int count2 = 0;
        
        q.add(root);
        count1 = 1;
        while(!q.isEmpty()) {
            while(count1 > 0) {
                TreeNode peek = q.remove();
                level.add(peek.val);
                if(peek.left != null) {
                    q.add(peek.left);
                    count2++;
                }
                if(peek.right != null) {
                    q.add(peek.right);
                    count2++;
                }
                count1--;
            }
            count1 = count2;
            count2 = 0;
            result.add(new ArrayList<Integer>(level));
            System.out.println(result);
            level.clear();
        }
     return result;   
    }
}
