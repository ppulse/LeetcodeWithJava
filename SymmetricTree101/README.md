Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree `[1,2,2,3,4,4,3]` is symmetric:
```
    1
   / \
  2   2
 / \ / \
3  4 4  3
```
But the following `[1,2,2,null,3,null,3]` is not:
```
    1
   / \
  2   2
   \   \
   3    3
```
#####Note:
Bonus points if you could solve it both recursively and iteratively.

######思路
#####1、递归
左子树的值等于右子树的值  isSymmetric(root.left, root.right);


左子树的左子树的值 等于 右子树的右子树的值  isSymmetric(root1.left, root2.right)
左子树的右子树的值 等于 右子树的左子树的值  isSymmetric(root1.right, root2.left)

isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left); 

递归下去

#####2、循环
用栈模拟递归