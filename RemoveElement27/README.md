Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

#####Example:
Given input array *nums* = `[3,2,2,3]`, *val* = `3`

Your function should return length = 2, with the first two elements of *nums* being 2.

###### 思路
left从左往右找到等于val的位置
right从右往左找到不等于val的位置
若left<right 则交换left和right位置的值
循环直到 left > right 结束