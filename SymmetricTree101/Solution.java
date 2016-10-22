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
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        
        
        TreeNode left = root.left;
        TreeNode right = root.right;
        
        
        if (left == null && right == null)
            return true;
        else if (left == null || right == null)
            return false;
        
        
        Stack<TreeNode> dlr = new Stack<TreeNode>();
        Stack<TreeNode> drl = new Stack<TreeNode>();
        
        dlr.push(left);
        drl.push(right);
        
        while (!dlr.empty() && !drl.empty()) {
            TreeNode leftChild = dlr.pop();
            TreeNode rightChild = drl.pop();
            
            if (leftChild == null || rightChild == null)
                return false;
            
            if (leftChild.val != rightChild.val)
                return false;
            
            if (leftChild.left != null || rightChild.right != null) {
                dlr.push(leftChild.left);
                drl.push(rightChild.right);
            }
            
            if (leftChild.right != null || rightChild.left != null) {
                dlr.push(leftChild.right);
                drl.push(rightChild.left);
            }
        }
        
        return true;
    }
    
    // public boolean isSymmetric(TreeNode root) {
    //     if (root == null)
    //         return true;
       
    //     return isSymmetric(root.left, root.right);
    // }
    
    // private boolean isSymmetric(TreeNode root1, TreeNode root2) {
    //     if (root1 == null && root2 == null)
    //         return true;
    //     else if (root1 == null || root2 == null)
    //         return false;
        
    //     if (root1.val == root2.val)
    //         return isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    //     else
    //         return false;
    // }
}