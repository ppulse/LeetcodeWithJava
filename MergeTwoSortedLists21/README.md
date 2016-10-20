Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

######思路
1->3->5->6->7

0->2->4->8->9->10

四个指针，一个用于保存合并后的头节点
一个用于保存某次合并后的尾节点，
另外两个用于保存原来的两个链表
如设为head，curr，nodeP，nodeQ

1. 合并前，nodeP: 1   nodeQ: 0   nodeQ.val<nodeP.val
   因此合并后 head=nodeQ: 0， curr=head: 0, nodeP: 1， nodeQ: 2   
2. 合并前 curr: 0   nodeP: 1  nodeQ: 2
   合并后 curr: 1   nodeP: 3  nodeQ: 2
3. 合并前 curr: 1   nodeP: 3  nodeQ: 2
   合并后 curr: 2   nodeP: 3  nodeQ: 4
4. 合并前 curr: 2   nodeP: 3  nodeQ: 4
   合并后 curr: 3   nodeP: 5  nodeQ: 4
5. 合并前 curr: 3   nodeP: 5  nodeQ: 4
   合并后 curr: 4   nodeP: 5  nodeQ: 8
6. 合并前 curr: 4   nodeP: 5  nodeQ: 8
   合并后 curr: 5   nodeP: 6  nodeQ: 8
7. 合并前 curr: 5   nodeP: 6  nodeQ: 8
   合并后 curr: 6   nodeP: 7  nodeQ: 8
8. 合并前 curr: 6   nodeP: 7  nodeQ: 8
   合并后 curr: 7   nodeP: null  nodeQ: 8
9. 合并前 curr: 7   nodeP: null  nodeQ: 8

停止循环，curr.next = nodeQ

