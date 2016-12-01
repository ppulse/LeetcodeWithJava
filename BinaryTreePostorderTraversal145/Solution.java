/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        if (root != null)
            postorderTraversal(root, result);
        
        return result;
    }
    
    private void postorderTraversal(TreeNode node, List<Integer> result) {
        if (node.left != null)
            postorderTraversal(node.left, result);
        
        if (node.right != null)
            postorderTraversal(node.right, result);
        
        result.add(node.val);
    }    
}