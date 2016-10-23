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
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        
        return hasPathSum(root, 0, sum);
    }
    
    private boolean hasPathSum(TreeNode node, int pathSum, int expectedSum) {
        int currentSum = pathSum + node.val;

        if (node.left == null && node.right == null) {
            return currentSum == expectedSum;
        }
        
        boolean leftHasPathSum = false;
        if (node.left != null)
            leftHasPathSum = hasPathSum(node.left, currentSum, expectedSum);
        
        boolean rightHasPathSum = false;
        if (!leftHasPathSum && node.right != null)
            rightHasPathSum = hasPathSum(node.right, currentSum, expectedSum);
        
        return leftHasPathSum || rightHasPathSum;
    }
}
