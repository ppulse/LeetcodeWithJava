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
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
            
        return getDepth(root, 1);
    }
    
    private int getDepth(TreeNode node, int depth) {
        if (node.left == null && node.right == null)
            return depth;
            
        int leftDepth = Integer.MAX_VALUE;
        int rightDepth = Integer.MAX_VALUE;
        
        if (node.left != null) {
            leftDepth = getDepth(node.left, depth + 1);
        }
        
        if (node.right != null) {
            rightDepth = getDepth(node.right, depth + 1);
        }
        
        return leftDepth < rightDepth ? leftDepth : rightDepth;
    }
}