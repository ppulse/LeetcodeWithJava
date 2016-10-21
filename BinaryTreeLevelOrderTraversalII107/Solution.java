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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        levelOrderBottom(root, result, 1);
        
        result = reverseResult(result);
        
        return result;
    }
    
    private void levelOrderBottom(TreeNode node, List<List<Integer>> result, int depth) {
        if (node == null)
            return;
        
        List<Integer> levelContainer;
        if (result.size() < depth) {
            levelContainer = new ArrayList<Integer>();
            levelContainer.add(node.val);
            result.add(levelContainer);
        } else {
            levelContainer = result.get(depth - 1);
            levelContainer.add(node.val);
        }
        
        levelOrderBottom(node.left, result, depth + 1);
        levelOrderBottom(node.right, result, depth + 1);
    }
    
    private List<List<Integer>> reverseResult(List<List<Integer>> result) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        
        for (int i = result.size() - 1; i >= 0; i--) {
            ret.add(result.get(i));
        }
        
        return ret;
    }
}