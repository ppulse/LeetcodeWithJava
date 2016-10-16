Given an array of size n, find the majority element. The majority element is the element that appears **more than** `⌊ n/2 ⌋` times.

You may assume that the array is non-empty and the majority element always exist in the array.

#### method
O(NlogN)

利用快排思路

由于待选元素个数大于`⌊ n/2 ⌋`，则排序后`⌊ n/2 ⌋`位置的元素就是该元素

将数组分成两组，一边大于pivot，一边小于pivot
若pivot所在索引等于`⌊ n/2 ⌋`，则查找结束
若大于`⌊ n/2 ⌋`，则待查元素位于左半侧，递归查找左半侧
小于`⌊ n/2 ⌋`，则待查元素位于右半侧，递归查找右半侧