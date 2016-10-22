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
    class TreeNodeInfo {
        public int height;
        public boolean isBalanced ;
        public TreeNodeInfo(int height, boolean isBalanced) {
            this.height = height;
            this.isBalanced = isBalanced;
        }
    }
    
    public boolean isBalanced(TreeNode root) {
        TreeNodeInfo info = getTreeNodeInfo(root);
        
        return info.isBalanced;
    }
    
    private TreeNodeInfo getTreeNodeInfo(TreeNode node) {
        TreeNodeInfo info = new TreeNodeInfo(0, true);
        
        if (node == null) {
            return info;
        }
        
        TreeNodeInfo left = getTreeNodeInfo(node.left);
        if (left.isBalanced) {
            TreeNodeInfo right = getTreeNodeInfo(node.right);
            
            if (right.isBalanced) {
                info.isBalanced = Math.abs(left.height - right.height) < 2;
                info.height = Math.max(left.height, right.height) + 1;
                return info;
            }
        }
        
        info.isBalanced = false;
        
        return info;
    }
}