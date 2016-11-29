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
    // public List<Integer> preorderTraversal(TreeNode root) {
    //     List<Integer> result = new ArrayList<Integer>();
        
    //     if (root != null)
    //         preorderTraversal(root, result);
            
    //     return result;
    // }
    
    // private void preorderTraversal(TreeNode node, List<Integer> result) {
    //     result.add(node.val);
    //     if (node.left != null)
    //         preorderTraversal(node.left, result);
        
    //     if (node.right != null)
    //         preorderTraversal(node.right, result);
    // }
    // 
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        
        if (root != null) {
            stack.push(root);
            while (!stack.empty()) {
                TreeNode node = stack.pop();
                result.add(node.val);
                
                if (node.right != null) {
                    stack.push(node.right);
                }
                
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        
        return result;
    }
}