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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null)
            return result;
        
        Stack<Integer> path = new Stack<Integer>();
        preOrder(root, path, result, 0, sum);
        return result;
    }
    
    private final void preOrder(TreeNode node, Stack<Integer> path, List<List<Integer>> result, int currSum, int expectedSum) {
        path.push(node.val);
        currSum += node.val;
        
        if (node.left == null && node.right == null && currSum == expectedSum) {
            if (currSum == expectedSum) {
                List<Integer> pathList = new ArrayList<Integer>();
                for (int val : path) {
                    pathList.add(val);
                }
                
                result.add(pathList);
            }
        }
        
        if (node.left != null) {
            preOrder(node.left, path, result, currSum, expectedSum);
        }
        
        if (node.right != null) {
            preOrder(node.right, path, result, currSum, expectedSum);
        }
        
        path.pop();
    }
}