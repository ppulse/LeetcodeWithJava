Reverse a singly linked list.

##### 思路
```
1->2->3->4->5
三个指针，一个prev，一个curr，一个next
将curr.next赋值为prev，依次遍历，到原链表尾处结束
核心代码
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
```
