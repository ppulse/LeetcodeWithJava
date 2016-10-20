Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow **a node to be a descendant of itself**).”
```

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5
```
For example, the lowest common ancestor (LCA) of nodes `2` and `8` is `6`. Another example is LCA of nodes `2` and `4` is `2`, since a node can be a descendant of itself according to the LCA definition.


##### 思路
由于是二叉搜索树
因此，最低公共祖先应该是

1. 其值大于等于p的值，且小于等于q的值；
2. 或者其值小于等于p的值，且大于等于q的值

因此，若当前节点的值大于p的值且大于q的值，则LCA在左子树
     若当前节点的值小于p的值且小于q的值，则LCA在右子树
