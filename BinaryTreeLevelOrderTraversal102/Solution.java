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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        levelOrder(root, result, 1);
        
        return result;
    }
    
    private void levelOrder(TreeNode root, List<List<Integer>> result, int depth) {
        if (root == null)
            return;
        
        List<Integer> levelContainer = null;
        if (result.size() < depth) {
            levelContainer = new ArrayList<Integer>();
            levelContainer.add(root.val);
            result.add(levelContainer);
        } else {
            levelContainer = result.get(depth - 1);
            levelContainer.add(root.val);
        }
        
        levelOrder(root.left, result, depth + 1);
        levelOrder(root.right, result, depth + 1);
    }
}