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
    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> result = new ArrayList<List<Integer>>();
        
    //     levelOrder(root, result, 1);
        
    //     return result;
    // }
    
    // private void levelOrder(TreeNode root, List<List<Integer>> result, int depth) {
    //     if (root == null)
    //         return;
        
    //     List<Integer> levelContainer = null;
    //     if (result.size() < depth) {
    //         levelContainer = new ArrayList<Integer>();
    //         levelContainer.add(root.val);
    //         result.add(levelContainer);
    //     } else {
    //         levelContainer = result.get(depth - 1);
    //         levelContainer.add(root.val);
    //     }
        
    //     levelOrder(root.left, result, depth + 1);
    //     levelOrder(root.right, result, depth + 1);
    // }
    // 

    // public List<List<Integer>> levelOrder(TreeNode root) {
    //     List<List<Integer>> result = new ArrayList<List<Integer>>();
        
    //     if (root == null)
    //         return result;
        
    //     Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
    //     currentLevel.offer(root);
        
    //     while (!currentLevel.isEmpty()) {
    //         int size = currentLevel.size();
    //         List<Integer> currList = new ArrayList<Integer>();
            
    //         for (int i = 0; i < size; i++) {
    //             TreeNode node = currentLevel.poll();
    //             currList.add(node.val);
                
    //             if (node.left != null) {
    //                 currentLevel.offer(node.left);    
    //             }
            
    //             if (node.right != null) {
    //                 currentLevel.offer(node.right);
    //             }
                
    //         }
            
    //         result.add(currList);
    //     }
        
        
    //     return result;
    // }


    private class TreeNodeWithDepth {
        int depth;
        TreeNode node;
        
        public TreeNodeWithDepth(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if (root == null)
            return result;
        
        Queue<TreeNodeWithDepth> queue = new LinkedList<TreeNodeWithDepth>();
        
        queue.offer(new TreeNodeWithDepth(root, 1));
        
        while (!queue.isEmpty()) {
            TreeNodeWithDepth node = queue.poll();
                        
            TreeNode treeNode = node.node;
            int depth = node.depth;
            
            List<Integer> currList;
            if (result.size() < node.depth) {
                currList = new ArrayList<Integer>();
                currList.add(treeNode.val);
                result.add(currList);
            } else {
                currList = result.get(depth - 1);
                currList.add(treeNode.val);
            }
            
            if (treeNode.left != null) {
                queue.offer(new TreeNodeWithDepth(treeNode.left, depth + 1));
            }
            
            if (treeNode.right != null) {
                queue.offer(new TreeNodeWithDepth(treeNode.right, depth + 1));    
            }
        }
        
        
        return result;
    }
}