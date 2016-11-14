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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();

        inorder(root, result);
        return result;
    }
    
    private void inorder(TreeNode node, List<Integer> result) {
        if (node == null)
            return;
        inorder(node.left, result);
        result.add(node.val);
        inorder(node.right, result);
    }
}