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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        
        if (root == null)
            return result;

        Stack<TreeNode> path = new Stack<TreeNode>();
        
        path.push(root);    
        binaryTreePaths(root, result, path);
        path.pop();    
            
        return result;
    }
    
    private void binaryTreePaths(TreeNode root, List<String> result, Stack<TreeNode> path) {
        if (root.left == null && root.right == null) {
            String pathString = path2String(path);
            result.add(pathString);
            return;
        }
        
        if (root.left != null) {
            path.push(root.left);
            binaryTreePaths(root.left, result, path);
            path.pop();
        }
            
        if (root.right != null) {
            path.push(root.right);
            binaryTreePaths(root.right, result, path);
            path.pop();
        }
    }
    
    private String path2String(Stack<TreeNode> path) {
        StringBuilder sb = new StringBuilder();
        Iterator<TreeNode> iter = path.iterator();
        
        while (iter.hasNext()) {
            sb.append(iter.next().val);
            
            if (iter.hasNext())
                sb.append("->");
        }
        
        return sb.toString();
    }
}